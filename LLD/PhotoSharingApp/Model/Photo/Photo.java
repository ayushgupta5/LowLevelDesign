package Model.Photo;

import Model.User.User;

public class Photo {
    private int photoID;
    private String photoURL;
    private String description;
    private User owner;

    public Photo(int photoID, String photoURL, String description, User owner) {
        this.photoID = photoID;
        this.photoURL = photoURL;
        this.description = description;
        this.owner = owner;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "photoID=" + photoID +
                ", photoURL='" + photoURL + '\'' +
                ", description='" + description + '\'' +
                ", owner=" + owner +
                '}';
    }
}
