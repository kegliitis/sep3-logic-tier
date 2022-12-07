package via.sep3.grpcclient.implementation;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import via.sep3.controller.utils.jwt.ChannelUtils;
import via.sep3.grpcclient.client.IReportsClient;
import via.sep3.model.CreateReport;
import via.sep3.model.Location;
import via.sep3.model.Report;
import via.sep3.protobuf.report.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReportsClient implements IReportsClient
{
    private ManagedChannel managedChannel = ChannelUtils.getInstance();
    private ReportGrpc.ReportBlockingStub reportBlockingStub = ReportGrpc.newBlockingStub(managedChannel);

    @Override
    public Report createReport(CreateReport newReport, String creatorEmail){
        LocationObject location = LocationObject.newBuilder()
                .setLatitude(newReport.getLocation().getLatitude())
                .setLongitude(newReport.getLocation().getLongitude())
                .setSize(newReport.getLocation().getSize())
                .build();

        CreateReportObject input = CreateReportObject.newBuilder()
                .setDate(String.format("%04d/%02d/%02d", newReport.getDate()[0], newReport.getDate()[1], newReport.getDate()[2]))
                .setTime(String.format("%02d:%02d:%02d", newReport.getTime()[0], newReport.getTime()[1], newReport.getTime()[2]))
                .setLocation(location)
                .setProof(ByteString.copyFrom(newReport.getProof()))
                .setDescription(newReport.getDescription())
                .setStatus(newReport.getStatus())
                .setCreatorEmail(creatorEmail)
                .build();

        ReportObject response = reportBlockingStub.createReport(input);

        return new Report((LocalDate.parse(response.getDate())), (LocalTime.parse(response.getTime())),
                response.getProof().toByteArray(), response.getDescription(), response.getStatus(),
                new Location(response.getLocation().getLatitude(),response.getLocation().getLongitude(),(byte)response.getLocation().getSize()),
                response.getId(), response.getUser().getUsername(), response.getUser().getUsername());
    }

    @Override
    public List<Report> getReports(String email, boolean approved)
    {
        ReportsFilter filter = ReportsFilter.newBuilder()
                .setEmail(email)
                .setApproved(approved)
                .build();
        ReportList reportList = reportBlockingStub.getReports(filter);
        List<Report> reports = new ArrayList<>();

        for (ReportObject grpcReport : reportList.getReportsList())
        {
            Report report = new Report(LocalDate.parse(grpcReport.getDate()), LocalTime.parse(grpcReport.getTime()),
                    grpcReport.getProof().toByteArray(), grpcReport.getDescription(), grpcReport.getStatus(),
                    new Location(grpcReport.getLocation().getLatitude(), grpcReport.getLocation().getLongitude(), (byte) grpcReport.getLocation().getSize())
                    , grpcReport.getUser().getUserId(),grpcReport.getUser().getUsername(),grpcReport.getId());
            reports.add(report);
        }
        return reports;
    }

    @Override
    public Report getReportById(String reportId)
    {
        ReportId input = ReportId.newBuilder()
                .setId(reportId)
                .build();

        ReportObject response = reportBlockingStub.getReportById(input);

        return new Report(LocalDate.parse(response.getDate()), LocalTime.parse(response.getTime()),
                response.getProof().toByteArray(), response.getDescription(), response.getStatus(),
                new Location(response.getLocation().getLatitude(), response.getLocation().getLongitude(), (byte) response.getLocation().getSize())
                , response.getUser().getUserId(),response.getUser().getUsername(),response.getId());
    }

    @Override
    public String reviewReport(String id, String status) {
        ToReviewReport toReviewReport = ToReviewReport.newBuilder()
                .setReportId(id)
                .setUpdatedStatus(status)
                .build();

        ReviewedReport reviewedReport = reportBlockingStub.reviewReport(toReviewReport);

        return reviewedReport.getConfirmation();

    }
}
