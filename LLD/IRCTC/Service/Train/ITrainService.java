package Service.Train;

import Model.Seat.Seat;
import Model.Train.Train;

public interface ITrainService {
    void searchTrain(Train train);
    void checkAvailability(Seat seat);
}
