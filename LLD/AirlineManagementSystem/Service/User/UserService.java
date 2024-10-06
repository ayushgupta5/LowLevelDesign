package Service.User;

import Model.User.User;

public class UserService implements IUserService {

    @Override
    public void login(User user) {
        System.out.println("User is Logging In : " + user.toString());
    }

    @Override
    public void logout(User user) {
        System.out.println("User is Logging Out : " + user.toString());
    }
}
