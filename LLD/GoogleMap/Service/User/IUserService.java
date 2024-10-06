package Service.User;

import Model.User.User;

public interface IUserService {
    void updateLocation(User user);
    void getLocation(User user);
}
