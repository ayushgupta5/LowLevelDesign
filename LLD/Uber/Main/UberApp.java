package Main;

import Model.Driver.Driver;
import Model.Payment.Payment;
import Model.Rating.Rating;
import Model.Ride.Ride;
import Model.Rider.Rider;
import Model.User.User;
import Service.Driver.DriverService;
import Service.Driver.IDriverService;
import Service.Payment.IPaymentService;
import Service.Payment.PaymentService;
import Service.Rating.IRatingService;
import Service.Rating.RatingService;
import Service.Ride.IRideService;
import Service.Ride.RideService;
import Service.Rider.IRiderService;
import Service.Rider.RiderService;
import Service.User.IUserService;
import Service.User.UserService;

public class UberApp {
    public static void main(String[] args) {
        User user1 = new User(1, "Kohli", "Kohli@gmail.com", "123", "Rider");
        User user2 = new User(1, "Driver", "Driver@gmail.com", "123", "Driver");

        Rider rider = new Rider(user1.getUserID(), user1.getName(), user1.getEmail(), user1.getPhone(), user1.getRole(), "UPI");
        Driver driver = new Driver(user2.getUserID(), user2.getName(), user2.getEmail(), user2.getPhone(), user2.getRole(), "123", "vehicleDetails", "Available");

        Ride ride = new Ride(1, rider, driver, "src", "dst", "Started", 100.00);
        Payment payment = new Payment(1, ride, 100.00, "Processing");

        Rating rating = new Rating(ride, 9, 9, "Awesome");

        IUserService userService = new UserService();
        userService.login(user1);
        userService.login(user2);

        IRiderService riderService = new RiderService();
        riderService.requestRide(ride);
        riderService.trackRide(ride);
        riderService.makePayment(payment);
        riderService.rateDriver(driver);

        IDriverService driverService = new DriverService();
        driverService.acceptRide(ride);
        driverService.startRide(ride);
        driverService.rateRider(ride);
        driverService.endRide(ride);

        IRideService rideService = new RideService();
        rideService.calculateFare(ride);
        rideService.updateRideStatus(ride);

        IPaymentService paymentService = new PaymentService();
        paymentService.processPayment(payment);

        IRatingService ratingService = new RatingService();
        ratingService.provideFeedback(rating);

        userService.logout(user1);
        userService.logout(user2);

    }
}
