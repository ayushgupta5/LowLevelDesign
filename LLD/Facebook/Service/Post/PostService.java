package Service.Post;

import Model.Post.Post;

public class PostService implements IPostService {
    @Override
    public void createPost(Post post) {
        System.out.println("Creating the Post : " +post.toString());
    }

    @Override
    public void editPost(Post post) {
        System.out.println("Editing the Post : " +post.toString());
    }

    @Override
    public void deletePost(Post post) {
        System.out.println("Deleting the Post : " +post.toString());
    }
}
