package Service.Meeting;

import Model.Meeting.Meeting;

public interface IMeetingService {
    void startMeeting(Meeting meeting);
    void endMeeting(Meeting meeting);
}
