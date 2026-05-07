package BehaviouralDesignPattern.IteratorPattern;

public class IteratorMain {
    public static void main(String[] args) {
        NotificationManager notificationManager = new NotificationManager();
        notificationManager.addEmailNotification("Email notification added");
        notificationManager.addSMSNotification("SMS notification added");

        notificationManager.printAllNotifications();
    }
}
