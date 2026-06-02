package StructuralDesignPattern.AdapterPattern;

public class NewNotificationService {
    public void send(String recipient, String body, String title) {
        System.out.println("Sending email via New service to " + recipient);
        System.out.println("message " + body);
        System.out.println("subject " + title);
    }
}
