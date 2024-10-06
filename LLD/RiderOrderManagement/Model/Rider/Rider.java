package Model.Rider;

public class Rider {
    private int riderID;
    private String name;
    private String RiderStatus;
    private String currentLocation;

    public Rider(int riderID, String name, String riderStatus, String currentLocation) {
        this.riderID = riderID;
        this.name = name;
        RiderStatus = riderStatus;
        this.currentLocation = currentLocation;
    }

    public int getRiderID() {
        return riderID;
    }

    public void setRiderID(int riderID) {
        this.riderID = riderID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRiderStatus() {
        return RiderStatus;
    }

    public void setRiderStatus(String riderStatus) {
        RiderStatus = riderStatus;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "riderID=" + riderID +
                ", name='" + name + '\'' +
                ", RiderStatus='" + RiderStatus + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                '}';
    }
}
