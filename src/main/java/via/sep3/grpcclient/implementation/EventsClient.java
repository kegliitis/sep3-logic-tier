package via.sep3.grpcclient.implementation;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import org.springframework.stereotype.Service;
import via.sep3.controller.utils.jwt.ChannelUtils;
import via.sep3.grpcclient.client.IEventsClient;
import via.sep3.model.*;
import via.sep3.model.dtos.EventAttendeesDto;
import via.sep3.model.dtos.EventReportDto;
import via.sep3.model.dtos.UserDto;
import via.sep3.protobuf.event.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class EventsClient implements IEventsClient
{
    private ManagedChannel managedChannel = ChannelUtils.getInstance();
    private EventGrpc.EventBlockingStub eventBlockingStub = EventGrpc.newBlockingStub(managedChannel);

    @Override
    public Event createEvent(CreateEvent createEvent, String creatorEmail)
    {
        CreateEventObject input = CreateEventObject.newBuilder()
                .setDate(String.format("%04d/%02d/%02d", createEvent.getDate()[0], createEvent.getDate()[1], createEvent.getDate()[2]))
                .setTime(String.format("%02d:%02d:%02d", createEvent.getTime()[0], createEvent.getTime()[1], createEvent.getTime()[2]))
                .setDescription(createEvent.getDescription())
                .setCreatorEmail(creatorEmail)
                .setReportId(createEvent.getReportId())
                .build();

        EventObject response = eventBlockingStub.createEvent(input);

        UserDto organiser = new UserDto(response.getOrganiser().getId(), response.getOrganiser().getUsername());

        return new Event(response.getId(), LocalDate.parse(response.getDate()), LocalTime.parse(response.getTime()),
                response.getDescription(), response.getValidation().toByteArray(), organiser,
                new EventReportDto(response.getReport().getProof().toByteArray(), response.getReport().getDescription(),
                        new Location(response.getReport().getLocation().getLatitude(), response.getReport().getLocation().getLongitude(),
                        (byte)response.getReport().getLocation().getSize())), response.getApproved());
    }

    @Override
    public List<Event> getEvents(String email, String filter)
    {
        EventsFilter input = EventsFilter.newBuilder()
                .setEmail(email)
                .setFilter(filter)
                .build();

        EventList response = eventBlockingStub.getEvents(input);

        List<Event> events = new ArrayList<>();

        for (EventObject grpcEvent: response.getEventsList())
        {
            UserDto organiser = new UserDto(grpcEvent.getOrganiser().getId(), grpcEvent.getOrganiser().getUsername());

            Event event = new Event(grpcEvent.getId(), LocalDate.parse(grpcEvent.getDate()), LocalTime.parse(grpcEvent.getTime()),
                    grpcEvent.getDescription(), grpcEvent.getValidation().toByteArray(), organiser,
                    new EventReportDto(grpcEvent.getReport().getProof().toByteArray(), grpcEvent.getReport().getDescription(),
                            new Location(grpcEvent.getReport().getLocation().getLatitude(), grpcEvent.getReport().getLocation().getLongitude(),
                                    (byte)grpcEvent.getReport().getLocation().getSize())), grpcEvent.getApproved());
            events.add(event);
        }
        return events;
    }

    @Override
    public Event getEventById(String eventId)
    {
        EventFilter input = EventFilter.newBuilder()
                .setId(eventId)
                .build();

        EventObject response = eventBlockingStub.getEvent(input);

        ArrayList<EventAttendeesDto> attendees = new ArrayList<>();

        for (UserEventObject attendee: response.getAttendeesList())
        {
            attendees.add(new EventAttendeesDto(attendee.getId(), attendee.getUsername()));
        }

        UserDto organiser = new UserDto(response.getOrganiser().getId(), response.getOrganiser().getUsername());

        return new Event(response.getId(), LocalDate.parse(response.getDate()), LocalTime.parse(response.getTime()),
                response.getDescription(), response.getValidation().toByteArray(), organiser,
            new EventReportDto(response.getReport().getProof().toByteArray(), response.getReport().getDescription(),
                    new Location(response.getReport().getLocation().getLatitude(), response.getReport().getLocation().getLongitude(),
                            (byte)response.getReport().getLocation().getSize())), response.getApproved(), attendees);
    }

    @Override
    public void approveEvent(String id, boolean approve) {
        ApproveEventFilter input = ApproveEventFilter.newBuilder()
                .setId(id)
                .setApprove(approve)
                .build();

        eventBlockingStub.approveEvent(input);
    }

    @Override
    public void attendEvent(String eventId, String creatorEmail) {

        EventToAttend eventToAttend=EventToAttend.newBuilder()
                .setEventId(eventId)
                .setUserEmail(creatorEmail)
                .build();

        eventBlockingStub.attendEvent(eventToAttend);
    }

    @Override
    public String submitValidation(String id, byte[] validation)
    {
        Validation grpcValidation = Validation.newBuilder()
                .setEventId(id)
                .setValidation(ByteString.copyFrom(validation))
                .build();

        ValidationConfirmation response = eventBlockingStub.submitValidation(grpcValidation);
        return response.getConfirmation();
    }
}
