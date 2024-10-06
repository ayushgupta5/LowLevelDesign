package Model.Notification;

public class Notification {
    private int notificationID;
    private String notificationType;
    private String message;

    public Notification(int notificationID, String notificationType, String message) {
        this.notificationID = notificationID;
        this.notificationType = notificationType;
        this.message = message;
    }

    public int getNotificationID() {
        return notificationID;
    }

    public void setNotificationID(int notificationID) {
        this.notificationID = notificationID;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "notificationID=" + notificationID +
                ", notificationType='" + notificationType + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
