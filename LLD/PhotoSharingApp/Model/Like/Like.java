package Model.Like;

import Model.Photo.Photo;
import Model.User.User;

public class Like {
    private int likeID;
    private Photo photo;
    private User user;

    public Like(int likeID, Photo photo, User user) {
        this.likeID = likeID;
        this.photo = photo;
        this.user = user;
    }

    public int getLikeID() {
        return likeID;
    }

    public void setLikeID(int likeID) {
        this.likeID = likeID;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Like{" +
                "likeID=" + likeID +
                ", photo=" + photo +
                ", user=" + user +
                '}';
    }
}
