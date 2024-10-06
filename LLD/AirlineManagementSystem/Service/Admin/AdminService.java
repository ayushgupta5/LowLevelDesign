package Service.Admin;

import Model.Flight.Flight;

public class AdminService implements IAdminService {
    @Override
    public void addFlight(Flight flight) {
        System.out.println("Adding the Flights : " + flight.toString());
    }

    @Override
    public void updateFlight(Flight flight) {
        System.out.println("Updating the Flights : " + flight.toString());
    }

    @Override
    public void removeFlight(Flight flight) {
        System.out.println("Removing the Flights : " + flight.toString());
    }

    @Override
    public void viewSchedule(Flight flight) {
        System.out.println("Viewing the Flights Schedule of Flight: " + flight);
    }
}
