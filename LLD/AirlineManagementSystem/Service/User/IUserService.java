package Service.User;

import Model.User.User;

public interface IUserService {
    void login(User user);
    void logout(User user);
}
