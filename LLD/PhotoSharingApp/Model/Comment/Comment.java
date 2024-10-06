package Model.Comment;

import Model.Photo.Photo;
import Model.User.User;

public class Comment {
    private int commentID;
    private Photo photo;
    private User user;
    private String text;

    public Comment(int commentID, Photo photo, User user, String text) {
        this.commentID = commentID;
        this.photo = photo;
        this.user = user;
        this.text = text;
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID=" + commentID +
                ", photo=" + photo +
                ", user=" + user +
                ", text='" + text + '\'' +
                '}';
    }
}
