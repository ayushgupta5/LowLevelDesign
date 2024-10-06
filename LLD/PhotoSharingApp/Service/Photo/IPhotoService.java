package Service.Photo;

import Model.Photo.Photo;
import Model.Tag.Tag;

public interface IPhotoService {
    void uploadPhoto(Photo photo);
    void deletePhoto(Photo photo);
    void addTag(Tag tag);
    void removeTage(Tag tag);
}
