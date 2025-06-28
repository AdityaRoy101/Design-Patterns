package Factory_Design_Pattern;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email notification sent to user");
    }
}
