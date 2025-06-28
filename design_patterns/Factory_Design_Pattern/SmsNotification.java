package Factory_Design_Pattern;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification sent to user");
    }
}
