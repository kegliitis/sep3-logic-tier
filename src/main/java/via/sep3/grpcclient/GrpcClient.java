package via.sep3.grpcclient;

import via.sep3.model.Report;

import java.util.List;

public interface GrpcClient
{
    List<Report> getReports();
}
