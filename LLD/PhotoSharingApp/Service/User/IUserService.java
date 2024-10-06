package Service.User;

import Model.User.User;

public interface IUserService {
    void register();
    void login(User user);
    void followUser(User user1, User user2);
    void unfollowUser(User user1, User user2);
}
