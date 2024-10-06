package Service.Driver;

import Model.Ride.Ride;

public class DriverService implements IDriverService {
    @Override
    public void acceptRide(Ride ride) {
        System.out.println("Accept the Ride: " + ride.toString());
    }

    @Override
    public void startRide(Ride ride) {
        System.out.println("Starting the Ride: "+ ride.toString());
    }

    @Override
    public void endRide(Ride ride) {
        System.out.println("Ending the Ride : " + ride.toString());
    }

    @Override
    public void rateRider(Ride ride) {
        System.out.println("Rating the Ride: " + ride.toString());
    }
}
