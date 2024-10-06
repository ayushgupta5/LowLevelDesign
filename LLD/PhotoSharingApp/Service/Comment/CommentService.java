package Service.Comment;

import Model.Comment.Comment;

public class CommentService implements  ICommentService {
    @Override
    public void addComment(Comment comment) {
        System.out.println("Adding the comment : " + comment.toString());
    }

    @Override
    public void deleteComment(Comment comment) {
        System.out.println("Deleting the comment : " + comment.toString());
    }
}
