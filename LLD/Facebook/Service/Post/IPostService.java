package Service.Post;

import Model.Post.Post;

public interface IPostService {
    void createPost(Post post);
    void editPost(Post post);
    void deletePost(Post post);

}
