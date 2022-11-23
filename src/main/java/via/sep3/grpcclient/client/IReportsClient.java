package via.sep3.grpcclient.client;

import via.sep3.model.Report;

import java.util.List;

public interface IReportsClient
{
    List<Report> getReports();
}
