package Service.User;

import Model.User.User;

public class UserService implements  IUserService {
    @Override
    public void register() {
        System.out.println("User is Registering");
    }

    @Override
    public void login(User user) {
        System.out.println("User is Logging In : " +user.toString());
    }

    @Override
    public void followUser(User user1, User user2) {
        System.out.println("User1 is Following User2 : " +user1.toString() + " User2 : " + user2.toString());
    }

    @Override
    public void unfollowUser(User user1, User user2) {
        System.out.println("User1 is UnFollowing User2 : " +user1.toString() + " User2 : " + user2.toString());
    }
}
