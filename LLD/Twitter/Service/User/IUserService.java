package Service.User;

import Model.Message.Message;
import Model.User.User;

public interface IUserService {
    void register();
    void login(User user);
    void follow(User user1, User user2);
    void unfollow(User user1, User user2);
    void sendMessage(Message message);
}
