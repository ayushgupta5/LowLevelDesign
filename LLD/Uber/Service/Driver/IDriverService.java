package Service.Driver;

import Model.Ride.Ride;

public interface IDriverService {
    void acceptRide(Ride ride);
    void startRide(Ride ride);
    void endRide(Ride ride);
    void rateRider(Ride ride);
}
