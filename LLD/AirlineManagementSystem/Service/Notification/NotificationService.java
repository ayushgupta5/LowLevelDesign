package Service.Notification;

import Model.User.User;

public class NotificationService implements INotificationService {
    @Override
    public void sendNotification(User user) {
        System.out.println("Sending the Notifications to user : " +user.toString());
    }
}
