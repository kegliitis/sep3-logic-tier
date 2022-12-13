package via.sep3.model.dtos;

import via.sep3.model.User;

import java.util.ArrayList;
import java.util.List;

public class EventDto
{
    private String id;
    private int[] date;
    private int[] time;
    private String description;
    private byte[] validation;
    private UserDto organiser;
    private EventReportDto report;
    private boolean approved;
    private List<EventAttendeesDto> attendees;

    public EventDto(String id, int[] date, int[] time, String description, byte[] validation, UserDto organiser, EventReportDto report, boolean approved, List<EventAttendeesDto> attendees)
    {
        this.id = id;
        this.date = date;
        this.time = time;
        this.description = description;
        this.validation = validation;
        this.organiser = organiser;
        this.report = report;
        this.approved = approved;
        this.attendees = attendees;
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

    public byte[] getValidation()
    {
        return validation;
    }

    public void setValidation(byte[] validation)
    {
        this.validation = validation;
    }

    public UserDto getOrganiser()
    {
        return organiser;
    }

    public void setOrganiserId(UserDto organiser)
    {
        this.organiser = organiser;
    }

    public EventReportDto getReport()
    {
        return report;
    }

    public void setReport(EventReportDto report)
    {
        this.report = report;
    }

    public boolean getApproved()
    {
        return approved;
    }

    public void setApproved(boolean approved)
    {
        this.approved = approved;
    }
    public List<EventAttendeesDto> getAttendees()
    {
        return attendees;
    }

    public void setAttendees(List<EventAttendeesDto> attendees)
    {
        this.attendees = attendees;
    }
}
