package via.sep3.grpcclient.implementation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import via.sep3.controller.utils.jwt.ChannelUtils;
import via.sep3.grpcclient.client.IEventsClient;
import via.sep3.model.*;
import via.sep3.protobuf.event.*;
import via.sep3.protobuf.report.ReportId;
import via.sep3.protobuf.report.ReportObject;
import via.sep3.protobuf.report.ReviewedReport;
import via.sep3.protobuf.report.ToReviewReport;

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


        return new Event(response.getId(), LocalDate.parse(response.getDate()), LocalTime.parse(response.getTime()),
                response.getDescription(), response.getValidation().toByteArray(),
                response.getOrganiser().getId(), response.getOrganiser().getUsername(),
                new EventReportDto(response.getReport().getProof().toByteArray(), response.getReport().getDescription(),
                        new Location(response.getReport().getLocation().getLatitude(), response.getReport().getLocation().getLongitude(),
                        (byte)response.getReport().getLocation().getSize())));
    }

    @Override
    public List<Event> getEvents()
    {
        EventFilter input = EventFilter.newBuilder().build();

        EventList response = eventBlockingStub.getEvents(input);

        List<Event> events = new ArrayList<>();

        for (EventObject grpcEvent: response.getEventsList())
        {
            Event event = new Event(grpcEvent.getId(), LocalDate.parse(grpcEvent.getDate()), LocalTime.parse(grpcEvent.getTime()),
                    grpcEvent.getDescription(), grpcEvent.getValidation().toByteArray(),
                    grpcEvent.getOrganiser().getId(), grpcEvent.getOrganiser().getUsername(),
                    new EventReportDto(grpcEvent.getReport().getProof().toByteArray(), grpcEvent.getReport().getDescription(),
                            new Location(grpcEvent.getReport().getLocation().getLatitude(), grpcEvent.getReport().getLocation().getLongitude(),
                                    (byte)grpcEvent.getReport().getLocation().getSize())));
            events.add(event);
        }
        return events;
    }

    @Override
    public Event getEventById(String reportId)
    {
        /*ReportId input = ReportId.newBuilder()
                .setId(reportId)
                .build();

        ReportObject response = reportBlockingStub.getReportById(input);

        return new Report(LocalDate.parse(response.getDate()), LocalTime.parse(response.getTime()),
                response.getProof().toByteArray(), response.getDescription(), response.getStatus(),
                new Location(response.getLocation().getLatitude(), response.getLocation().getLongitude(), (byte) response.getLocation().getSize())
                , response.getUser().getUserId(),response.getUser().getUsername(),response.getId());
        */
        return null;
    }

    @Override
    public void approveEvent(String id, boolean approve) {
        /*ToReviewReport toReviewReport = ToReviewReport.newBuilder()
                .setReportId(id)
                .setUpdatedStatus(status)
                .build();

        ReviewedReport reviewedReport = reportBlockingStub.reviewReport(toReviewReport);

        return reviewedReport.getConfirmation();
        */
    }
}
