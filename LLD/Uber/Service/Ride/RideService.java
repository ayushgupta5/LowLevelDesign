package Service.Ride;

import Model.Driver.Driver;
import Model.Payment.Payment;
import Model.Ride.Ride;
import Service.Rider.IRiderService;

public class RideService implements IRideService {

    @Override
    public void calculateFare(Ride ride) {
        System.out.println("Calculating the Fare for the Ride : " +ride.toString());
    }

    @Override
    public void updateRideStatus(Ride ride) {
        System.out.println("Updating the Ride Status : " +ride.toString());
    }
}
