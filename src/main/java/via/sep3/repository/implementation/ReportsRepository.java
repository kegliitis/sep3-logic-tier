package via.sep3.repository.implementation;

import org.springframework.stereotype.Repository;
import via.sep3.grpcclient.client.IReportsClient;
import via.sep3.grpcclient.implementation.ReportsClient;
import via.sep3.repository.intf.IReportsRepository;
import via.sep3.model.CreateReport;
import via.sep3.model.Report;

import java.util.List;

@Repository
public class ReportsRepository implements IReportsRepository {
    private IReportsClient reportsClient;

    public ReportsRepository(ReportsClient reportsClient) {
        this.reportsClient = reportsClient;
    }

    @Override
    public List<Report> getReports(String email, boolean approved) {
        try {
            return reportsClient.getReports(email, approved);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public Report createReport(CreateReport report, String creatorEmail) {
        try {
            return reportsClient.createReport(report, creatorEmail);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Report getReportById(String reportId)
    {
        try
        {
            return reportsClient.getReportById(reportId);
        }
        catch (Exception e)
        {
            throw e;
        }
    }

    @Override
    public String reviewReport(String id, String status)
    {
        try {
            return reportsClient.reviewReport(id, status);
        }
        catch (Exception e) {
            throw e;
        }
    }
}
