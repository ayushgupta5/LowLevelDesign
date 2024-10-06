package Service.User;

import Model.Meeting.Meeting;
import Model.User.User;

public interface IUserService {
    void login(User user);
    void updateProfile(User user);
    void joinMeeting(Meeting meeting);
}
