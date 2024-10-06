package Service.Customer;

import Model.Booking.Booking;
import Model.Flight.Flight;

public class CustomerService implements ICustomerService {
    @Override
    public void searchFlights(Flight flight) {
        System.out.println("Searching the Flights : " + flight.toString());
    }

    @Override
    public void bookFlight(Flight flight) {
        System.out.println("Booking the Flights : " + flight.toString());
    }

    @Override
    public void cancelBooking(Booking booking) {
        System.out.println("Cancelling the Flights : " + booking.toString());
    }

    @Override
    public void selectSeat() {
        System.out.println("Selecting the Seats in Flights");
    }
}
