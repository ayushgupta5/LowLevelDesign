package Service.Seat;

import Model.Seat.Seat;

public class SeatService implements ISeatService {
    @Override
    public void updateAvailability(Seat seat) {
        System.out.println("Updating the Availability of the Seat : " +seat.toString());
    }
}
