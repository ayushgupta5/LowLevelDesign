package Service.Train;

import Model.Seat.Seat;
import Model.Train.Train;

public class TrainService implements ITrainService {
    @Override
    public void searchTrain(Train train) {
        System.out.println("Searching for the Ticket: " +train.toString());
    }

    @Override
    public void checkAvailability(Seat seat) {
        System.out.println("Checking the Availability : " +seat.toString());
    }
}
