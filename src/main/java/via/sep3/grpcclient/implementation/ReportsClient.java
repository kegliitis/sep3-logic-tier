package via.sep3.grpcclient.implementation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;
import via.sep3.grpcclient.client.IReportsClient;
import via.sep3.model.CreateReport;
import via.sep3.model.Location;
import via.sep3.model.Report;
import via.sep3.protobuf.report.ReportFilter;
import via.sep3.protobuf.report.ReportGrpc;
import via.sep3.protobuf.report.ReportList;
import via.sep3.protobuf.report.ReportObject;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReportsClient implements IReportsClient
{
    private ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 5266)
            .usePlaintext()
            .build();

    private ReportGrpc.ReportBlockingStub reportBlockingStub = ReportGrpc.newBlockingStub(managedChannel);


    @Override
    public Report createReport(CreateReport newReport) {
        CreateReportInput input = CreateReportInput.newBuilder()
                .setDate(newReport.getDate())
                .setTime(newReport.getTime())
                .setProof(newReport.getProof())
                .setDescription(newReport.getDescription())
                .setStatus(newReport.getStatus());

        ReportObject response = reportBlockingStub.createReport(input);

        return new Report(/*response.getId(),*/(LocalDate.parse(response.getDate()), (LocalTime.parse(response.getTime())),response.getProof(),
                response.getDescription(), response.getStatus(),
                new Location(response.getLocation().getLatitude(),response.getLocation().getLongitude(),(byte)response.getLocation().getSize()));
    }

    @Override
    public List<Report> getReports()
    {
        ReportFilter filter = ReportFilter.newBuilder().build();
        ReportList reportList = reportBlockingStub.getReports(filter);
        List<Report> reports = new ArrayList<>();

        for (ReportObject grpcReport : reportList.getReportsList())
        {
            Report report = new Report(LocalDate.parse(grpcReport.getDate()), LocalTime.parse(grpcReport.getTime()),
                    grpcReport.getProof().toByteArray(), grpcReport.getDescription(), grpcReport.getStatus(),
                    new Location(grpcReport.getLocation().getLatitude(), grpcReport.getLocation().getLongitude(), (byte) grpcReport.getLocation().getSize()));
            reports.add(report);
        }
        return reports;
    }
}
