package Service.Tweet;

import Model.Tweet.Tweet;

public class TweetService implements ITweetService {
    @Override
    public void create(Tweet tweet) {
        System.out.println("User is Tweeting : " +tweet.toString());
    }

    @Override
    public void like(Tweet tweet) {
        System.out.println("User Likes the Tweet : " +tweet.toString());
    }

    @Override
    public void retweet(Tweet tweet) {
        System.out.println("User is ReTweeting : " +tweet.toString());
    }
}
