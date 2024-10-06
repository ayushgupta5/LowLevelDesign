package Main;

import Model.Follow.Follow;
import Model.Message.Message;
import Model.Tweet.Tweet;
import Model.User.User;
import Service.Follow.FollowService;
import Service.Follow.IFollowService;
import Service.Message.IMessageService;
import Service.Message.MessageService;
import Service.Tweet.ITweetService;
import Service.Tweet.TweetService;
import Service.User.IUserService;
import Service.User.UserService;

import java.time.LocalDateTime;

public class TwitterApp {
    public static void main(String[] args) {
        User user1 = new User(1, "Kohli", "Password", "kohli@gmail.com");
        User user2 = new User(1, "Rohit", "Password", "rohit@gmail.com");
        LocalDateTime createdAt = LocalDateTime.now();
        Tweet tweet = new Tweet(1, 1, "Cricket", createdAt);
        LocalDateTime sentAt = LocalDateTime.now();
        Message message = new Message(1, 1, 1, "Cricket", sentAt);
        Follow follow = new Follow(1, 1);

        IUserService userService = new UserService();
        userService.register();
        userService.login(user1);
        userService.login(user2);
        userService.unfollow(user1, user2);
        userService.follow(user1, user2);
        userService.follow(user2, user1);
        userService.sendMessage(message);

        ITweetService tweetService = new TweetService();
        tweetService.create(tweet);
        tweetService.like(tweet);
        tweetService.retweet(tweet);

        IMessageService messageService = new MessageService();
        messageService.send(message);

        IFollowService followService = new FollowService();
        followService.unfollow(follow);
        followService.follow(follow);
    }
}
