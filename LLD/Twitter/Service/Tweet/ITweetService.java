package Service.Tweet;

import Model.Tweet.Tweet;

public interface ITweetService {
    void create(Tweet tweet);
    void like(Tweet tweet);
    void retweet(Tweet tweet);
}
