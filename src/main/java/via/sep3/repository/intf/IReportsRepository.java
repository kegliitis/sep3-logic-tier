package via.sep3.repository.intf;

import via.sep3.model.CreateReport;
import via.sep3.model.Report;

import java.util.List;

public interface IReportsRepository {
    List<Report> getReports(String email, boolean approved);
    Report createReport(CreateReport report, String creatorEmail);

    String reviewReport(String id, String status);
}
