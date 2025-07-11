package Factory_Design_Pattern;

public abstract class NotificationFactory {
    public abstract Notification createNotification();

    public void sendNotification() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
}
