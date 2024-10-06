package Main;

import Model.Comment.Comment;
import Model.Like.Like;
import Model.Photo.Photo;
import Model.Tag.Tag;
import Model.User.User;
import Service.Comment.CommentService;
import Service.Comment.ICommentService;
import Service.Like.ILikeService;
import Service.Like.LikeService;
import Service.Photo.IPhotoService;
import Service.Photo.PhotoService;
import Service.Tag.ITagService;
import Service.Tag.TagService;
import Service.User.IUserService;
import Service.User.UserService;

public class PhotoSharingApp {
    public static void main(String[] args) {
        User user1 = new User(1, "Kohli", "kohli@gmail.com", "password");
        User user2 = new User(2, "Rohit", "rohit@gmail.com", "password");

        Photo photo = new Photo(1, "PhotoUrl", "Photo", user1);
        Comment comment = new Comment(1, photo, user1, "Awesome");
        Like like = new Like(1, photo, user1);
        Tag tag = new Tag(1, "TagName");

        IUserService userService = new UserService();
        userService.register();
        userService.login(user1);
        userService.login(user2);
        userService.unfollowUser(user1, user2);
        userService.followUser(user1, user2);

        IPhotoService photoService = new PhotoService();
        photoService.deletePhoto(photo);
        photoService.uploadPhoto(photo);
        photoService.removeTage(tag);
        photoService.addTag(tag);

        ICommentService commentService = new CommentService();
        commentService.addComment(comment);
        commentService.deleteComment(comment);

        ILikeService likeService = new LikeService();
        likeService.likePhoto(photo);
        likeService.unlikePhoto(photo);

        ITagService tagService = new TagService();
        tagService.createTag(tag);
        tagService.deleteTag(tag);


    }
}
