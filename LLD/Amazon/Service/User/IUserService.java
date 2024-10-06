package Service.User;

import Model.User.User;

public interface IUserService {
    void register();
    void login(User user);
}
