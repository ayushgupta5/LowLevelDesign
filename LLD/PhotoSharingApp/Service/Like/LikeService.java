package Service.Like;

import Model.Photo.Photo;

public class LikeService implements ILikeService {
    @Override
    public void likePhoto(Photo photo) {
        System.out.println("Liking the Photo : " + photo.toString());
    }

    @Override
    public void unlikePhoto(Photo photo) {
        System.out.println("Unlike the photo : " + photo.toString());
    }
}
