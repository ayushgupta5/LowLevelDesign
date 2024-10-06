package Service.User;

import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void register() {
        System.out.println("User is Registering");
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging in : " +user);
    }

    @Override
    public void updateProfile(User user) {
        System.out.println("User is Updating the Profile : " +user);
    }
}
