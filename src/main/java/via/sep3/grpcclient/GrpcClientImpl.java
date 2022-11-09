package via.sep3.grpcclient;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
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

public class GrpcClientImpl implements GrpcClient
{
    private ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 8909)
            .usePlaintext()
            .build();

    private ReportGrpc.ReportBlockingStub reportBlockingStub = ReportGrpc.newBlockingStub(managedChannel);

    @Override
    public List<Report> getReports()
    {
        ReportList reportList = reportBlockingStub.getReports(ReportFilter.newBuilder().build());
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
