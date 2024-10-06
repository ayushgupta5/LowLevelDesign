package Model.Message;

import java.time.LocalDateTime;

public class Message {
    private int messageID;
    private int senderID;
    private int receiverID;
    private String content;
    private LocalDateTime sentAt;

    public Message(int messageID, int senderID, int receiverID, String content, LocalDateTime sentAt) {
        this.messageID = messageID;
        this.senderID = senderID;
        this.receiverID = receiverID;
        this.content = content;
        this.sentAt = sentAt;
    }

    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public int getSenderID() {
        return senderID;
    }

    public void setSenderID(int senderID) {
        this.senderID = senderID;
    }

    public int getReceiverID() {
        return receiverID;
    }

    public void setReceiverID(int receiverID) {
        this.receiverID = receiverID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageID=" + messageID +
                ", senderID=" + senderID +
                ", receiverID=" + receiverID +
                ", content='" + content + '\'' +
                ", sentAt=" + sentAt +
                '}';
    }
}
