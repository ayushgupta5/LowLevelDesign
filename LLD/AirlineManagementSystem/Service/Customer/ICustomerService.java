package Service.Customer;

import Model.Booking.Booking;
import Model.Flight.Flight;

public interface ICustomerService {
    void searchFlights(Flight flight);
    void bookFlight(Flight flight);
    void cancelBooking(Booking booking);
    void selectSeat();
}
