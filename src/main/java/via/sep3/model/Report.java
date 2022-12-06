package via.sep3.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Report
{
    private LocalDate date;
    private LocalTime time;
    private byte[] proof;       //this allows one image as of now
    private String description;
    private String status;
    private Location location;

    private String userId;

    private String userName;

    private String reportId; //TODO: Fix in database also

    public Report(LocalDate date, LocalTime time, byte[] proof, String description,
                  String status, Location location, String userId, String userName, String reportId)
    {
        this.date = date;
        this.time = time;
        this.proof = proof;
        this.description = description;
        this.status = status;
        this.location = location;
        this.userId = userId;
        this.userName = userName;
        this.reportId = reportId;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getReportId() {
        return reportId;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public LocalTime getTime()
    {
        return time;
    }

    public byte[] getProof()
    {
        return proof;
    }

    public String getDescription()
    {
        return description;
    }

    public String getStatus()
    {
        return status;
    }

    public Location getLocation()
    {
        return location;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

}
