package via.sep3.model;

import via.sep3.model.dtos.EventAttendeesDto;
import via.sep3.model.dtos.EventReportDto;
import via.sep3.model.dtos.UserDto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Event
{
    private String id;
    private LocalDate date;
    private LocalTime time;
    private String description;
    private byte[] validation;
    private UserDto organiser;
    private EventReportDto report;
    private boolean approved;

    private List<EventAttendeesDto> attendees;

    public Event(String id, LocalDate date, LocalTime time, String description, byte[] validation, UserDto organiser, EventReportDto report, boolean approved, ArrayList<EventAttendeesDto> attendees)
    {
        this.id = id;
        this.date = date;
        this.time = time;
        this.description = description;
        this.validation = validation;
        this.report = report;
        this.approved = approved;
        this.organiser = organiser;
        this.attendees = attendees;
    }

    public Event(String id, LocalDate date, LocalTime time, String description, byte[] validation, UserDto organiser, EventReportDto report, boolean approved)
    {
        this.id = id;
        this.date = date;
        this.time = time;
        this.description = description;
        this.validation = validation;
        this.report = report;
        this.organiser = organiser;
        this.approved = approved;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    public LocalTime getTime()
    {
        return time;
    }

    public void setTime(LocalTime time)
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

    public void setOrganiser(UserDto organiser)
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
