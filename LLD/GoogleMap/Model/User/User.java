package Model.User;

public class User {
    private int userID;
    private String name;
    private String currentLocation;

    public User(int userID, String name, String currentLocation) {
        this.userID = userID;
        this.name = name;
        this.currentLocation = currentLocation;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                '}';
    }
}
