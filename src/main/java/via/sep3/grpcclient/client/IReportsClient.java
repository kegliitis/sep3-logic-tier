package via.sep3.grpcclient.client;

import via.sep3.model.CreateReport;
import via.sep3.model.Report;

import java.util.List;

public interface IReportsClient
{

    Report createReport(CreateReport newReport, String creatorEmail);
    List<Report> getReports();
}
