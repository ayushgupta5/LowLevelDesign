package Service.Ride;

import Model.Ride.Ride;

public interface IRideService {
    void calculateFare(Ride ride);
    void updateRideStatus(Ride ride);
}
