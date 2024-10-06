package Service.Traffic;

import Model.Traffic.Traffic;

public interface ITrafficService {
    void getTrafficInfo(Traffic traffic);
    void updateTrafficInfo(Traffic traffic);
}
