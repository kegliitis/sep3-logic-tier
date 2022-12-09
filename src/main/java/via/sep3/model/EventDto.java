package via.sep3.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventDto
{
    private String id;
    private int[] date;
    private int[] time;
    private String description;
    private String status;
    private byte[] validation;
    private String organiserId;
    private String username;
    private EventReportDto report;

    public EventDto(String id, int[] date, int[] time, String description, String status, byte[] validation, String organiserId, String username, EventReportDto report)
    {
        this.id = id;
        this.date = date;
        this.time = time;
        this.description = description;
        this.status = status;
        this.validation = validation;
        this.organiserId = organiserId;
        this.username = username;
        this.report = report;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public int[] getDate()
    {
        return date;
    }

    public void setDate(int[] date)
    {
        this.date = date;
    }

    public int[] getTime()
    {
        return time;
    }

    public void setTime(int[] time)
    {
        this.time = time;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public byte[] getValidation()
    {
        return validation;
    }

    public void setValidation(byte[] validation)
    {
        this.validation = validation;
    }

    public String getOrganiserId()
    {
        return organiserId;
    }

    public void setOrganiserId(String organiserId)
    {
        this.organiserId = organiserId;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public EventReportDto getReport()
    {
        return report;
    }

    public void setReport(EventReportDto report)
    {
        this.report = report;
    }
}
