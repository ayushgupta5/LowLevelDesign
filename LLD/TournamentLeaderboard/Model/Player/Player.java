package Model.Player;

public class Player {
    private int playerID;
    private String name;
    private String email;

    public Player(int playerID, String name, String email) {
        this.playerID = playerID;
        this.name = name;
        this.email = email;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerID=" + playerID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
