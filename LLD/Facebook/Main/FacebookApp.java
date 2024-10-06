package Main;

import Model.Friend.Friend;
import Model.Message.Message;
import Model.Post.Post;
import Model.User.User;
import Service.Friend.FriendService;
import Service.Friend.IFriendService;
import Service.Message.IMessageService;
import Service.Message.MessageService;
import Service.Post.IPostService;
import Service.Post.PostService;
import Service.User.IUserService;
import Service.User.UserService;

public class FacebookApp {
    public static void main(String[] args) {
        User user1 = new User(1, "Ayush", "ayush@gmail.com", "Password", "Bio", "Profile Picture");
        User user2 = new User(1, "Don", "don@gmail.com", "Password", "Bio", "Profile Picture");
        Post post = new Post(1, "Post Content", "MediaUrl", "createdAt", user1);
        Friend friend = new Friend(1, 1, "Accept");
        Message message = new Message(1, user1, user2, "Content", "createdAt");

        IUserService userService = new UserService();
        userService.register();
        userService.login(user1);
        userService.login(user2);

        IPostService postService = new PostService();
        postService.createPost(post);
        postService.editPost(post);
        postService.deletePost(post);

        IFriendService friendService = new FriendService();
        friendService.sendRequest(friend);
        friendService.acceptRequest(friend);
        friendService.rejectRequest(friend);
        friendService.unfriend(friend);

        IMessageService messageService = new MessageService();
        messageService.sendMessage(message);
        messageService.deleteMessage(message);

        userService.logout(user1);
        userService.logout(user2);
    }
}
