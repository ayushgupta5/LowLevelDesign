package Service.GPS;

import Model.User.User;

public class GPSService implements IGPSService {
    @Override
    public void subscribe(User user) {
        System.out.println("Subscribing the User : " +user.toString());
    }

    @Override
    public void unsubscribe(User user) {
        System.out.println("UnSubscribing the User : " +user.toString());
    }

    @Override
    public void notifyUsers(User user) {
        System.out.println("Notifying the User : " +user.toString());
    }
}
