package via.sep3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import via.sep3.controller.utils.JsonUtils;
import via.sep3.grpcclient.client.ReportsClient;
import via.sep3.grpcclient.implementation.ReportsClientImpl;
import via.sep3.model.Report;

import java.util.List;

@RestController
public class ReportsController
{
    ReportsClient grpcClient = new ReportsClientImpl();

    @GetMapping("/reports")
    public String getReports() throws Exception {
        try
        {
            List<Report> reports = grpcClient.getReports();

            return JsonUtils.convertToJson(reports);

        } catch (Exception e)
        {
            throw new Exception(e);
        }
    }
}
