package Service.Meeting;

import Model.Meeting.Meeting;

public class MeetingService implements IMeetingService {
    @Override
    public void startMeeting(Meeting meeting) {
        System.out.println("Starting the meeting: " + meeting.toString());
    }

    @Override
    public void endMeeting(Meeting meeting) {
        System.out.println("Ending the meeting: " + meeting.toString());
    }
}
