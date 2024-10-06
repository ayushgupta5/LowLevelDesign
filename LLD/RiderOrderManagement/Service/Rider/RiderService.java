package Service.Rider;

import Model.Rider.Rider;

public class RiderService implements IRiderService {
    @Override
    public void setStatus(Rider rider) {
        System.out.println("Set the Rider Status : " +rider.toString());
    }
}
