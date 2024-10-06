package Model.Friend;

public class Friend {
    private int userID;
    private int friendID;
    private String status;

    public Friend(int userID, int friendID, String status) {
        this.userID = userID;
        this.friendID = friendID;
        this.status = status;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getFriendID() {
        return friendID;
    }

    public void setFriendID(int friendID) {
        this.friendID = friendID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "userID=" + userID +
                ", friendID=" + friendID +
                ", status='" + status + '\'' +
                '}';
    }
}
