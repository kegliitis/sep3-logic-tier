package via.sep3.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class CreateReport {

    private int[] date;
    private int[] time;
    private byte[] proof;
    private String description;
    private String status;
    private Location location;

    public CreateReport(int[] date, int[] time, byte[] proof, String description, String status, Location location) {
        this.date = date;
        this.time = time;
        this.proof = proof;
        this.description = description;
        this.status = status;
        this.location = location;
    }

    public int[] getDate() {
        return date;
    }

    public void setDate(int[] date) {
        this.date = date;
    }

    public int[] getTime() {
        return time;
    }

    public void setTime(int[] time) {
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
}
