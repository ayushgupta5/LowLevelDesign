package Model.Tournament;

import java.time.LocalDateTime;

public class Tournament {
    private int tournamentID;
    private String name;
    private String type;
    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Tournament(int tournamentID, String name, String type, LocalDateTime startDate, LocalDateTime endDate) {
        this.tournamentID = tournamentID;
        this.name = name;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getTournamentID() {
        return tournamentID;
    }

    public void setTournamentID(int tournamentID) {
        this.tournamentID = tournamentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "tournamentID=" + tournamentID +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
