package via.sep3.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class CreateReport {

    private LocalDate date;
    private LocalTime time;
    private byte[] proof;
    private String description;
    private String status;
    private Location location;

    private String userId;

    public CreateReport(LocalDate date, LocalTime time, byte[] proof, String description, String status, Location location, String userId) {
        this.date = date;
        this.time = time;
        this.proof = proof;
        this.description = description;
        this.status = status;
        this.location = location;
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public byte[] getProof() {
        return proof;
    }

    public void setProof(byte[] proof) {
        this.proof = proof;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserId()
    {
        return  userId;
    }
}
