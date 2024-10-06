package Service.GPS;

import Model.User.User;

public interface IGPSService {
    void subscribe(User user);
    void unsubscribe(User user);
    void notifyUsers(User user);
}
