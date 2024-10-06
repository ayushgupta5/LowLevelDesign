package Model.Ride;

import Model.Driver.Driver;
import Model.Rider.Rider;

public class Ride {
    private int rideID;
    private Rider rider;
    private Driver driver;
    private String pickupLocation;
    private String dropOffLocation;
    private String status;
    private double fare;

    public Ride(int rideID, Rider rider, Driver driver, String pickupLocation, String dropOffLocation, String status, double fare) {
        this.rideID = rideID;
        this.rider = rider;
        this.driver = driver;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.status = status;
        this.fare = fare;
    }

    public int getRideID() {
        return rideID;
    }

    public void setRideID(int rideID) {
        this.rideID = rideID;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropOffLocation() {
        return dropOffLocation;
    }

    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "Ride{" +
                "rideID=" + rideID +
                ", rider=" + rider +
                ", driver=" + driver +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropOffLocation='" + dropOffLocation + '\'' +
                ", status='" + status + '\'' +
                ", fare=" + fare +
                '}';
    }
}
