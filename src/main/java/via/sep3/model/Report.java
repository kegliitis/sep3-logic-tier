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

    public Report(LocalDate date, LocalTime time, byte[] proof, String description, String status, Location location)
    {
        this.date = date;
        this.time = time;
        this.proof = proof;
        this.description = description;
        this.status = status;
        this.location = location;
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
