package via.sep3.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import via.sep3.controller.utils.jwt.JwtTokenUtil;
import via.sep3.protobuf.report.ToReviewReport;
import via.sep3.repository.intf.IReportsRepository;
import via.sep3.model.CreateReport;
import via.sep3.model.Report;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin()
public class ReportsController {

    private JwtTokenUtil jwtTokenUtil;
    private IReportsRepository reportRepo;


    public ReportsController(JwtTokenUtil jwtTokenUtil, IReportsRepository reportRepo)
    {
        this.jwtTokenUtil = jwtTokenUtil;
        this.reportRepo = reportRepo;
    }
    @RequestMapping(value = "/reports", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity createReport(@RequestHeader Map<String, String> headers, @RequestBody CreateReport newReport)
    {
        String token = headers.get("authorization").split(" ")[1];
        String creatorEmail = jwtTokenUtil.getEmailFromToken(token);

        try
        {
        Report createdReport = reportRepo.createReport(newReport, creatorEmail);

         return ResponseEntity.ok(createdReport);
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Oh Shit!: " + e);
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

    @PatchMapping("/reports/{id}")
    public ResponseEntity<String> reviewReport(
            @RequestBody ToReviewReport reportUpdate, @PathVariable ("id") String id){
                reportRepo.reviewReport(reportUpdate,id);
                return ResponseEntity.ok("Report reviewed");
    }

}
