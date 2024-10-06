package Service.Photo;

import Model.Photo.Photo;
import Model.Tag.Tag;

public class PhotoService implements IPhotoService {
    @Override
    public void uploadPhoto(Photo photo) {
        System.out.println("Uploading the Photo : " + photo.toString());
    }

    @Override
    public void deletePhoto(Photo photo) {
        System.out.println("Deleting the Photo : " + photo.toString());
    }

    @Override
    public void addTag(Tag tag) {
        System.out.println("Tagging the Photo : " + tag.toString());
    }

    @Override
    public void removeTage(Tag tag) {
        System.out.println("Removing the Tag : " + tag.toString());
    }
}
