package Model.Rating;

import Model.Ride.Ride;

public class Rating {
    private Ride ride;
    private int riderRating;
    private int driverRating;
    private String feedback;

    public Rating(Ride ride, int riderRating, int driverRating, String feedback) {
        this.ride = ride;
        this.riderRating = riderRating;
        this.driverRating = driverRating;
        this.feedback = feedback;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public int getRiderRating() {
        return riderRating;
    }

    public void setRiderRating(int riderRating) {
        this.riderRating = riderRating;
    }

    public int getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(int driverRating) {
        this.driverRating = driverRating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "ride=" + ride +
                ", riderRating=" + riderRating +
                ", driverRating=" + driverRating +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
