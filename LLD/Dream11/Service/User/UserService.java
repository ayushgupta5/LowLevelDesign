package Service.User;

import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void register() {
        System.out.println("Registering the User");
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging in : " + user.toString());
    }

    @Override
    public void logout(User user) {
        System.out.println("User is Logging Out : " +user.toString());
    }

    @Override
    public void addFunds() {
        System.out.println("User is Adding the Funds ");
    }

    @Override
    public void withdrawFunds() {
        System.out.println("User is Withdrawing the Funds ");
    }
}
