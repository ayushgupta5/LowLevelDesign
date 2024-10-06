package Service.Booking;

import Model.Booking.Booking;


public interface IBookingService {
    void bookTicket(Booking booking);
    void generatePNR(Booking booking);
    void cancelTicket(Booking booking);
}
