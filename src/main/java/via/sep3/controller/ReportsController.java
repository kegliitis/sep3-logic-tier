package via.sep3.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import via.sep3.controller.utils.JsonUtils;
import via.sep3.grpcclient.GrpcClient;
import via.sep3.grpcclient.GrpcClientImpl;
import via.sep3.model.Report;

import java.util.List;

@RestController
public class ReportsController
{
    @GetMapping("/reports")
    public String getReports() throws JsonProcessingException {
        try
        {
            GrpcClient grpcClient = new GrpcClientImpl();
            List<Report> reports = grpcClient.getReports();

            return JsonUtils.convertToJson(reports);

        } catch (JsonProcessingException e)
        {
            throw new RuntimeException(e);
        }
    }
}
