package Service.Comment;

import Model.Comment.Comment;

public interface ICommentService {
    void addComment(Comment comment);
    void deleteComment(Comment comment);
}
