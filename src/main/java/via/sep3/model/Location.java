package via.sep3.model;

public class Location
{
    private double latitude;    //north-south
    private double longitude;   //east-west
    private byte size;          //only 1 byte, maybe more will be necessary in the future

    public Location(double latitude, double longitude, byte size)
    {
        this.latitude = latitude;
        this.longitude = longitude;
        this.size = size;
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public byte getSize()
    {
        return size;
    }
}
