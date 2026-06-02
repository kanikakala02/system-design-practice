package StructuralDesignPattern.AdapterPattern;

public class Application {
    public static void main(String[] args) {
        NotificationService oldService= new LegacyEmailNotificationService();
        oldService.send("kanika@gmail.com","message recieved","Old Service test");

        NewNotificationService newNotificationService= new NewNotificationService();
        NotificationService newService = new Adapter(newNotificationService);
        newService.send("kanika@gmail.com","message recieved","New Service test");
    }
}
