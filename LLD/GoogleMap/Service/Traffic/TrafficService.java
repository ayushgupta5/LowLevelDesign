package Service.Traffic;

import Model.Traffic.Traffic;

public class TrafficService implements  ITrafficService {
    @Override
    public void getTrafficInfo(Traffic traffic) {
        System.out.println("Getting the Traffic info from Traffic Details : " +traffic.toString());
    }

    @Override
    public void updateTrafficInfo(Traffic traffic) {
        System.out.println("Updating the Traffic Info : " + traffic.toString());
    }
}
