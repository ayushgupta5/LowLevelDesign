package Service.User;

import Model.Meeting.Meeting;
import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void login(User user) {
        System.out.println("User is Logging in : " + user.toString());
    }

    @Override
    public void updateProfile(User user) {
        System.out.println("Updating the Profile : " + user.toString());
    }

    @Override
    public void joinMeeting(Meeting meeting) {
        System.out.println("Joining the meeting : " + meeting.toString());
    }
}
