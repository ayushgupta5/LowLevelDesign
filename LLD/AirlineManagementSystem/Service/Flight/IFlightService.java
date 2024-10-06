package Service.Flight;

import Model.Flight.Flight;

public interface IFlightService {
    void updateFlightDetails(Flight flight);
    void checkAvailability(Flight flight);
}
