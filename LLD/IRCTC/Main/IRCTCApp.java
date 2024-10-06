package Main;

import Model.Booking.Booking;
import Model.Payment.Payment;
import Model.Seat.Seat;
import Model.Train.Train;
import Model.User.User;
import Service.Booking.BookingService;
import Service.Booking.IBookingService;
import Service.Payment.IPaymentService;
import Service.Payment.PaymentService;
import Service.Seat.ISeatService;
import Service.Seat.SeatService;
import Service.Train.ITrainService;
import Service.Train.TrainService;
import Service.User.IUserService;
import Service.User.UserService;

import java.time.LocalDateTime;

public class IRCTCApp {
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "Kohli@gmail.com", "12345", "password");
        Train train = new Train(1, "RajdhaniExp", "VNS", "BLR", "departureTime", "arrivalTime");
        LocalDateTime bookingDate = LocalDateTime.now();
        Booking booking = new Booking(1, 123, 1, 123, bookingDate, "Booked");
        Payment payment = new Payment(1, 1, "UPI", "transactionID", 100.00, "Paid");
        Seat seat = new Seat(1, 1, "SL", 123);

        IUserService userService = new UserService();
        userService.register();
        userService.login(user);
        userService.viewPNRStatus(user, booking);
        userService.cancelTicket(user, booking);

        ITrainService trainService = new TrainService();
        trainService.searchTrain(train);
        trainService.checkAvailability(seat);

        IBookingService bookingService = new BookingService();
        bookingService.generatePNR(booking);
        bookingService.cancelTicket(booking);
        bookingService.bookTicket(booking);

        IPaymentService paymentService = new PaymentService();
        paymentService.makePayment(payment);
        paymentService.processRefund(payment);

        ISeatService seatService = new SeatService();
        seatService.updateAvailability(seat);
    }
}
