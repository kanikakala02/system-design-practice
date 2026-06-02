package StructuralDesignPattern.AdapterPattern;

public class Adapter implements NotificationService{
    NewNotificationService newNotificationService;

    public Adapter(NewNotificationService newNotificationService){
        this.newNotificationService = newNotificationService;
    }
    @Override
    public void send(String to, String message, String subject) {
        newNotificationService.send(to, message, subject);
    }
}
