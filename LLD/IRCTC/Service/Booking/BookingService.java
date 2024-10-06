package Service.Booking;

import Model.Booking.Booking;

public class BookingService implements IBookingService {
    @Override
    public void bookTicket(Booking booking) {
        System.out.println("Booking the Ticket: " +booking.toString());
    }

    @Override
    public void generatePNR(Booking booking) {
        System.out.println("Generating the PNR Number: " +booking.toString());
    }

    @Override
    public void cancelTicket(Booking booking) {
        System.out.println("Cancelling the Ticket: " +booking.toString());
    }
}
