package Service.Booking;

import Model.Booking.Booking;
public class BookingService implements IBookingService {
    @Override
    public void cancel(Booking booking) {
        System.out.println("Cancelling the Booking : " + booking.toString());
    }

    @Override
    public void confirm(Booking booking) {
        System.out.println("Confirming the Booking : " + booking.toString());
    }
}
