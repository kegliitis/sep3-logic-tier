package via.sep3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sep3.controller.utils.JsonUtils;
import via.sep3.grpcclient.client.IReportsClient;
import via.sep3.grpcclient.implementation.ReportsClient;
import via.sep3.model.Report;

import java.util.List;

@RestController
@CrossOrigin()
public class ReportsController {
    IReportsClient grpcClient = new ReportsClient();

    @RequestMapping(value = "/reports", method = RequestMethod.GET)
    public ResponseEntity getReports(){
        try
        {
            List<Report> reports = grpcClient.getReports();

            return ResponseEntity.ok(reports);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
