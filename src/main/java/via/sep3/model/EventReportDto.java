package via.sep3.model;

public class EventReportDto
{
    private byte[] proof;
    private String description;
    private Location location;

    public EventReportDto(byte[] proof, String description, Location location)
    {
        this.proof = proof;
        this.description = description;
        this.location = location;
    }

    public EventReportDto(String description, Location location)
    {
        this.description = description;
        this.location = location;
    }

    public byte[] getProof()
    {
        return proof;
    }

    public void setProof(byte[] proof)
    {
        this.proof = proof;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Location getLocation()
    {
        return location;
    }

    public void setLocation(Location location)
    {
        this.location = location;
    }
}
