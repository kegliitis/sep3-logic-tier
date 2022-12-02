package via.sep3.repository;

import org.springframework.stereotype.Repository;
import via.sep3.grpcclient.client.IReportsClient;
import via.sep3.grpcclient.implementation.ReportsClient;
import via.sep3.intf.IReportsRepository;
import via.sep3.model.Report;

import java.util.List;

@Repository
public class ReportsRepository implements IReportsRepository {
    private IReportsClient reportsClient;

    public ReportsRepository(ReportsClient reportsClient){
        this.reportsClient = reportsClient;
    }

    @Override
    public List<Report> getReport() {
        try {
            return reportsClient.getReports();
        } catch (Exception ex){
            throw ex;
        }
    }
}
