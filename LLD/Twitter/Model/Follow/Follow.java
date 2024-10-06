package Model.Follow;

public class Follow {
    private int followerID;
    private int followedID;

    public Follow(int followerID, int followedID) {
        this.followerID = followerID;
        this.followedID = followedID;
    }

    public int getFollowerID() {
        return followerID;
    }

    public void setFollowerID(int followerID) {
        this.followerID = followerID;
    }

    public int getFollowedID() {
        return followedID;
    }

    public void setFollowedID(int followedID) {
        this.followedID = followedID;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "followerID=" + followerID +
                ", followedID=" + followedID +
                '}';
    }
}
