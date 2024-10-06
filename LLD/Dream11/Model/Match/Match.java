package Model.Match;

import java.time.LocalDateTime;

public class Match {
    private int matchID;
    private String sportType;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Match(int matchID, String sportType, LocalDateTime startTime, LocalDateTime endTime) {
        this.matchID = matchID;
        this.sportType = sportType;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
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

    @Override
    public String toString() {
        return "Match{" +
                "matchID=" + matchID +
                ", sportType='" + sportType + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
