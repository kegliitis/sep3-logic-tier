package via.sep3.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sep3.controller.utils.jwt.JwtTokenUtil;
import via.sep3.model.GetReportDto;
import via.sep3.repository.intf.IReportsRepository;
import via.sep3.model.CreateReport;
import via.sep3.model.Report;

import java.util.ArrayList;
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

            List<GetReportDto> reportDtos = new ArrayList<>();

            for (Report report : reports)
            {
                int[] date = new int[]{report.getDate().getYear(), report.getDate().getMonthValue(), report.getDate().getDayOfMonth()};
                int[] time = new int[]{report.getTime().getHour(), report.getTime().getMinute(), report.getTime().getSecond()};
                reportDtos.add(new GetReportDto(report.getReportId(), date, time, report.getProof(), report.getDescription(), report.getStatus(), report.getLocation()));
            }

            return ResponseEntity.ok(reportDtos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
