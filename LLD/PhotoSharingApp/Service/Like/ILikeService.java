package Service.Like;

import Model.Photo.Photo;

public interface ILikeService {
    void likePhoto(Photo photo);
    void unlikePhoto(Photo photo);
}
