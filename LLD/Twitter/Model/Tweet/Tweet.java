package Model.Tweet;

import java.time.LocalDateTime;

public class Tweet {
    private int tweetID;
    private int userID;
    private String content;
    private LocalDateTime createdAt;

    public Tweet(int tweetID, int userID, String content, LocalDateTime createdAt) {
        this.tweetID = tweetID;
        this.userID = userID;
        this.content = content;
        this.createdAt = createdAt;
    }

    public int getTweetID() {
        return tweetID;
    }

    public void setTweetID(int tweetID) {
        this.tweetID = tweetID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "tweetID=" + tweetID +
                ", userID=" + userID +
                ", content='" + content + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
