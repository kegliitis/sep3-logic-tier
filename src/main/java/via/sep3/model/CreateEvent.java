package via.sep3.model;

public class CreateEvent
{
    private int[] date;
    private int[] time;
    private String description;
    private String reportId;

    public CreateEvent(int[] date, int[] time, String description, String reportId)
    {
        this.date = date;
        this.time = time;
        this.description = description;
        this.reportId = reportId;
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

    public String getReportId()
    {
        return reportId;
    }

    public void setReportId(String reportId)
    {
        this.reportId = reportId;
    }
}
