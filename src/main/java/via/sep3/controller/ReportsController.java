package via.sep3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sep3.repository.intf.IReportsRepository;
import via.sep3.model.CreateReport;
import via.sep3.model.Report;

import java.util.List;

@RestController
@CrossOrigin()
public class ReportsController {
    private IReportsRepository reportRepo;


    @RequestMapping(value = "/reports", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity createReport(@RequestBody CreateReport newReport)
    {
        try
        {
        Report createdReport = reportRepo.createReport(newReport);

         return ResponseEntity.ok(createdReport);
        }
        catch (Exception e)
        {
            System.out.println(e.getStackTrace());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }


    @RequestMapping(value = "/reports", method = RequestMethod.GET)
    public ResponseEntity getReports(){
        try
        {
            List<Report> reports = reportRepo.getReports();

            return ResponseEntity.ok(reports);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
