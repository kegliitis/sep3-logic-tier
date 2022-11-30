package via.sep3.repository.intf;

import via.sep3.model.CreateReport;
import via.sep3.model.Report;

import java.util.List;

public interface IReportsRepository {
    List<Report> getReports();
    Report createReport(CreateReport report);
}
