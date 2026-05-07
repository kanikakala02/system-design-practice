package BehaviouralDesignPattern.IteratorPattern;

import java.util.Iterator;

public class NotificationManager {
    private NotificationCollection emailNotificationCollection;
    private NotificationCollection smsNotificationCollection;

    public NotificationManager() {
        emailNotificationCollection= new EmailNotification();
        smsNotificationCollection= new SMSNotification();
    }

    public void addEmailNotification(String message){
        ((EmailNotification) emailNotificationCollection).addNotification(message);
    }

    public void addSMSNotification(String message){
        ((SMSNotification) smsNotificationCollection).addNotification(message);
    }

    public void printAllNotifications(){
        print(emailNotificationCollection.createIterator());
        print(smsNotificationCollection.createIterator());

    }

    public void print(Iterator<Notification> iterator){
        while(iterator.hasNext()){
            System.out.println(iterator.next().getMessage());
        }
    }
}
