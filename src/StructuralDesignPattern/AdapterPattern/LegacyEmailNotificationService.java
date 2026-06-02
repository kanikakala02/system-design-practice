package StructuralDesignPattern.AdapterPattern;

public class LegacyEmailNotificationService implements NotificationService{

    @Override
    public void send(String to, String message, String subject) {
        System.out.println("Sending email to " + to);
        System.out.println("message " + message);
        System.out.println("subject " + subject);
    }
}
