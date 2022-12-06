package via.sep3.repository.intf;

import via.sep3.model.CreateReport;
import via.sep3.model.Report;
import via.sep3.protobuf.report.ToReviewReport;

import java.util.List;

public interface IReportsRepository {
    List<Report> getReports();
    Report createReport(CreateReport report, String creatorEmail);

    String reviewReport(String id, String status);
}
