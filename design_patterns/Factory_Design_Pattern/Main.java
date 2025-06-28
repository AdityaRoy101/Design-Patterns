package Factory_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        NotificationFactory notificationFactory;

//        Email Factory
        notificationFactory = new EmailNotificationFactory();
        notificationFactory.sendNotification();

//        Sms Factory
        notificationFactory = new SmsNotificationFactory();
        notificationFactory.sendNotification();
    }
}
