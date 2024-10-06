package Service.Flight;

import Model.Flight.Flight;

public class FlightService implements IFlightService {
    @Override
    public void updateFlightDetails(Flight flight) {
        System.out.println("Updating the Flights : " + flight);
    }

    @Override
    public void checkAvailability(Flight flight) {
        System.out.println("Checking the Availability of the Flights : " + flight);
    }
}
