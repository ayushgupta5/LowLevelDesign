package Model.Message;

import java.time.LocalDateTime;

public class Message {
    private int messageID;
    private String content;
    private LocalDateTime timestamp;

    public Message(int messageID, String content, LocalDateTime timestamp) {
        this.messageID = messageID;
        this.content = content;
        this.timestamp = timestamp;
    }

    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageID=" + messageID +
                ", content='" + content + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
