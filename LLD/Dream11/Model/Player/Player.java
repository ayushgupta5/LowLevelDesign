package Model.Player;

public class Player {
    private int playerID;
    private String playerName;
    private String role;
    private int points;

    public Player(int playerID, String playerName, String role, int points) {
        this.playerID = playerID;
        this.playerName = playerName;
        this.role = role;
        this.points = points;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerID=" + playerID +
                ", playerName='" + playerName + '\'' +
                ", role='" + role + '\'' +
                ", points=" + points +
                '}';
    }
}
