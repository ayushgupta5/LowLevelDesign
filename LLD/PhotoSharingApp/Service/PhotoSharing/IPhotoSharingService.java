package Service.PhotoSharing;

import Model.Comment.Comment;
import Model.Photo.Photo;

public interface IPhotoSharingService {
    void uploadPhoto(Photo photo);
    void sharePhoto(Photo photo);
    void addComment(Comment comment);
    void likePhoto(Photo photo);
}
