package via.sep3.model.dtos;

import via.sep3.model.Location;

public class EventOverviewDto
{
    private String id;
    private int[] date;
    private int[] time;
    private String description;
    private Location location;
    private String organiserName;

    public EventOverviewDto(String id, int[] date, int[] time, String description, Location location, String organiserName)
    {
        this.id = id;
        this.date = date;
        this.time = time;
        this.description = description;
        this.location = location;
        this.organiserName = organiserName;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }
}
