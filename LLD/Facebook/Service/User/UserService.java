package Service.User;

import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void register() {
        System.out.println("User is Registering into FaceBook");
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging In into FaceBook: " +user.toString());
    }

    @Override
    public void editProfile(User user) {
        System.out.println(" User is Editing the Profile: " +user.toString());
    }

    @Override
    public void logout(User user) {
        System.out.println("User is Logging Out into FaceBook: " +user.toString());
    }
}
