package Service.Rider;

import Model.Driver.Driver;
import Model.Payment.Payment;
import Model.Ride.Ride;

public class RiderService implements  IRiderService {

    @Override
    public void requestRide(Ride ride) {
        System.out.println("Requesting the Ride : " +ride.toString());
    }

    @Override
    public void trackRide(Ride ride) {
        System.out.println("Tracking the Ride : " +ride.toString());
    }

    @Override
    public void makePayment(Payment payment) {
        System.out.println("Making the Payment: " +payment.toString());
    }

    @Override
    public void rateDriver(Driver driver) {
        System.out.println("Rating the Driver : " +driver.toString());
    }
}
