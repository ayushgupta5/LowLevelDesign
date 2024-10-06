package Service.Rider;

import Model.Driver.Driver;
import Model.Payment.Payment;
import Model.Ride.Ride;

public interface IRiderService {
    void requestRide(Ride ride);
    void trackRide(Ride ride);
    void makePayment(Payment payment);
    void rateDriver(Driver driver);
}
