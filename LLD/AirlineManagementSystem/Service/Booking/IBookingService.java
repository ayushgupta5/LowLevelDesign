package Service.Booking;

import Model.Booking.Booking;

public interface IBookingService {
    void cancel(Booking booking);
    void confirm(Booking Booking);
}
