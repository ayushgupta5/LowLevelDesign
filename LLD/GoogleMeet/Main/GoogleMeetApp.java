package Main;

import Model.Meeting.Meeting;
import Model.Message.Message;
import Model.Participant.Participant;
import Model.User.User;
import Service.Meeting.IMeetingService;
import Service.Meeting.MeetingService;
import Service.Message.IMessageService;
import Service.Message.MessageService;
import Service.User.IUserService;
import Service.User.UserService;

import java.time.LocalDateTime;

public class GoogleMeetApp {
    public static void main(String[] args) {
        User user = new User(1, "Ayush", "ayush@gmail.com", "password");
        Participant participant = new Participant(1, 1, 1);
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusHours(1);
        Meeting meeting = new Meeting(1, 1, startTime, endTime, "MeetingLink", true);
        Message message = new Message(1, "content", startTime);

        IUserService userService = new UserService();
        userService.login(user);
        userService.updateProfile(user);
        userService.joinMeeting(meeting);

        IMeetingService meetingService = new MeetingService();
        meetingService.startMeeting(meeting);
        meetingService.endMeeting(meeting);

        IMessageService messageService = new MessageService();
        messageService.sendMessage(message);
    }
}
