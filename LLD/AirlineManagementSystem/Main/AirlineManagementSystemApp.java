package Main;

import Model.Admin.Admin;
import Model.Booking.Booking;
import Model.Customer;
import Model.Flight.Flight;
import Model.Notification.Notification;
import Model.Payment.Payment;
import Model.User.User;
import Service.Admin.AdminService;
import Service.Admin.IAdminService;
import Service.Booking.BookingService;
import Service.Booking.IBookingService;
import Service.Customer.CustomerService;
import Service.Customer.ICustomerService;
import Service.Flight.FlightService;
import Service.Flight.IFlightService;
import Service.Notification.INotificationService;
import Service.Notification.NotificationService;
import Service.Payment.IPaymentService;
import Service.Payment.PaymentService;
import Service.User.IUserService;
import Service.User.UserService;

import java.time.LocalDateTime;

public class AirlineManagementSystemApp {
    public static void main(String[] args) {
        User user1 = new User(1, "Kohli", "Kohli@gmail.com", "Kohli@123");
        User user2 = new User(1, "Airline", "Airline@gmail.com", "Airline@123");

        LocalDateTime arrivalTime= LocalDateTime.now();
        LocalDateTime departureTime = arrivalTime.plusHours(3);

        Customer customer = new Customer(user1.getUserID(), user1.getName(), user1.getEmail(), user1.getPasswordHash());
        Admin admin = new Admin(user2.getUserID(), user2.getName(), user2.getEmail(), user2.getPasswordHash());
        Flight flight = new Flight(1, "src", "dst", arrivalTime, departureTime, 100.00, 12);
        Booking booking = new Booking(1, flight, customer, 12, "Processing");
        Payment payment = new Payment(1, 100.00, "Processing");
        Notification notification = new Notification(1, "Email", "Flight Booked");

        IUserService userService = new UserService();
        userService.login(customer);
        userService.login(admin);

        ICustomerService customerService = new CustomerService();
        customerService.searchFlights(flight);
        customerService.bookFlight(flight);
        customerService.cancelBooking(booking);
        customerService.selectSeat();

        IAdminService adminService = new AdminService();
        adminService.addFlight(flight);
        adminService.updateFlight(flight);
        adminService.removeFlight(flight);
        adminService.viewSchedule(flight);

        IFlightService flightService = new FlightService();
        flightService.updateFlightDetails(flight);
        flightService.checkAvailability(flight);

        IBookingService bookingService = new BookingService();
        bookingService.confirm(booking);
        bookingService.cancel(booking);

        IPaymentService paymentService = new PaymentService();
        paymentService.processPayment(payment);

        INotificationService notificationService = new NotificationService();
        notificationService.sendNotification(customer);
        notificationService.sendNotification(admin);

        userService.logout(customer);
        userService.logout(admin);

    }
}
