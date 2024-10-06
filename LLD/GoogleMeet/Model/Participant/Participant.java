package Model.Participant;

public class Participant{
    private int participantID;
    private int userID;
    private int meetingID;

    public Participant(int participantID, int userID, int meetingID) {
        this.participantID = participantID;
        this.userID = userID;
        this.meetingID = meetingID;
    }

    public int getParticipantID() {
        return participantID;
    }

    public void setParticipantID(int participantID) {
        this.participantID = participantID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(int meetingID) {
        this.meetingID = meetingID;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "participantID=" + participantID +
                ", userID=" + userID +
                ", meetingID=" + meetingID +
                '}';
    }
}
