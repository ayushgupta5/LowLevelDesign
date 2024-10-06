package Service.Admin;

import Model.Flight.Flight;

public interface IAdminService {
    void addFlight(Flight flight);
    void updateFlight(Flight flight);
    void removeFlight(Flight flight);
    void viewSchedule(Flight flight);
}
