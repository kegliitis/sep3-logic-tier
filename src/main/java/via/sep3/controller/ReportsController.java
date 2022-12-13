package via.sep3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import via.sep3.controller.utils.jwt.JwtTokenUtil;
import via.sep3.model.dtos.GetReportResponseDto;
import via.sep3.model.dtos.UpdateReportDto;
import via.sep3.repository.intf.IReportsRepository;
import via.sep3.model.CreateReport;
import via.sep3.model.Report;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin()
public class ReportsController
{

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
        } catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Oh Shit!: " + e);
        }
    }

    @RequestMapping(value = "/reports", method = RequestMethod.GET)
    public ResponseEntity getReports(@RequestHeader Map<String, String> headers, @RequestParam boolean approved)
    {
        try
        {
            String token = headers.get("authorization").split(" ")[1];
            String email = jwtTokenUtil.getEmailFromToken(token);
            List<Report> reports = reportRepo.getReports(email, approved);

            List<GetReportResponseDto> reportDtos = new ArrayList<>();

            for (Report report : reports)
            {
                int[] date = new int[]{report.getDate().getYear(), report.getDate().getMonthValue(), report.getDate().getDayOfMonth()};
                int[] time = new int[]{report.getTime().getHour(), report.getTime().getMinute(), report.getTime().getSecond()};
                reportDtos.add(new GetReportResponseDto(report.getReportId(), date, time, report.getProof(), report.getDescription(), report.getStatus(), report.getLocation()));
            }

            return ResponseEntity.ok(reportDtos);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PatchMapping("/reports/review")
    public ResponseEntity<String> reviewReport(@RequestParam String id, @RequestBody UpdateReportDto updateReportDto)
    {
        try
        {
            String response = reportRepo.reviewReport(id, updateReportDto.getStatus());
            return ResponseEntity.ok(response);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @RequestMapping(value = "/reports/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getReportById(@PathVariable String id)
    {
        try
        {
            Report report = reportRepo.getReportById(id);
            int[] date = new int[]{report.getDate().getYear(), report.getDate().getMonthValue(), report.getDate().getDayOfMonth()};
            int[] time = new int[]{report.getTime().getHour(), report.getTime().getMinute(), report.getTime().getSecond()};
            return ResponseEntity.ok(new GetReportResponseDto(report.getReportId(), date, time, report.getProof(), report.getDescription(), report.getStatus(), report.getLocation()));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

}
