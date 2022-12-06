package via.sep3.model.dtos;

public class UpdateReportDto
{
    private String status;


    public UpdateReportDto()
    {
    }

    public UpdateReportDto(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
}
