package via.sep3.grpcclient.implementation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import via.sep3.controller.utils.jwt.ChannelUtils;
import via.sep3.grpcclient.client.IEventsClient;
import via.sep3.model.*;
import via.sep3.protobuf.event.CreateEventObject;
import via.sep3.protobuf.event.EventGrpc;
import via.sep3.protobuf.event.EventObject;

import java.time.LocalDate;
import java.time.LocalTime;

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
                .setStatus(createEvent.getStatus())
                .setCreatorEmail(creatorEmail)
                .setReportId(createEvent.getReportId())
                .build();

        EventObject response = eventBlockingStub.createEvent(input);


        return new Event(response.getId(), LocalDate.parse(response.getDate()), LocalTime.parse(response.getTime()),
                response.getDescription(), response.getStatus(), response.getValidation().toByteArray(),
                response.getOrganiser().getId(), response.getOrganiser().getUsername(),
                new EventReport(response.getReport().getProof().toByteArray(), response.getReport().getDescription(),
                        new Location(response.getReport().getLocation().getLatitude(), response.getReport().getLocation().getLongitude(),
                        (byte)response.getReport().getLocation().getSize())));
    }
}
