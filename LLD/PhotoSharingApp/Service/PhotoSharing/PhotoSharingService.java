package Service.PhotoSharing;

import Model.Comment.Comment;
import Model.Photo.Photo;

public class PhotoSharingService implements IPhotoSharingService {
    @Override
    public void uploadPhoto(Photo photo) {
        System.out.println("Uploading the Photo : " +photo.toString());
    }

    @Override
    public void sharePhoto(Photo photo) {
        System.out.println("Sharing the Photo : " +photo.toString());
    }

    @Override
    public void addComment(Comment comment) {
        System.out.println("Adding the Comment : " +comment.toString());
    }

    @Override
    public void likePhoto(Photo photo) {
        System.out.println("Liking the Photo : " +photo.toString());
    }
}
