package Service.User;

import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void updateLocation(User user) {
        System.out.println("Updating the Location for User : " +user.toString());
    }

    @Override
    public void getLocation(User user) {
        System.out.println("Getting the Location of the User : " + user.toString());
    }
}
