package Model.Meeting;

import java.time.LocalDateTime;

public class Meeting {
    private int meetingID;
    private int hostUserID;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String meetingLink;
    private boolean isRecorded;

    public Meeting(int meetingID, int hostUserID, LocalDateTime startTime, LocalDateTime endTime, String meetingLink, boolean isRecorded) {
        this.meetingID = meetingID;
        this.hostUserID = hostUserID;
        this.startTime = startTime;
        this.endTime = endTime;
        this.meetingLink = meetingLink;
        this.isRecorded = isRecorded;
    }

    public int getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(int meetingID) {
        this.meetingID = meetingID;
    }

    public int getHostUserID() {
        return hostUserID;
    }

    public void setHostUserID(int hostUserID) {
        this.hostUserID = hostUserID;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getMeetingLink() {
        return meetingLink;
    }

    public void setMeetingLink(String meetingLink) {
        this.meetingLink = meetingLink;
    }

    public boolean isRecorded() {
        return isRecorded;
    }

    public void setRecorded(boolean recorded) {
        isRecorded = recorded;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "meetingID=" + meetingID +
                ", hostUserID=" + hostUserID +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", meetingLink='" + meetingLink + '\'' +
                ", isRecorded=" + isRecorded +
                '}';
    }
}
