package Model.Team;

import Model.Player.Player;
import Model.User.User;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private int teamID;
    private User user;
    private List<Player> listOfPlayers;

    public Team(int teamID, User user) {
        this.teamID = teamID;
        this.user = user;
        this.listOfPlayers = new ArrayList<>();
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Player> getListOfPlayers() {
        return listOfPlayers;
    }

    public void setListOfPlayers(List<Player> listOfPlayers) {
        this.listOfPlayers = listOfPlayers;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamID=" + teamID +
                ", user=" + user +
                ", listOfPlayers=" + listOfPlayers +
                '}';
    }
}
