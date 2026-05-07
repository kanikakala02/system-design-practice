package BehaviouralDesignPattern.IteratorPattern;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SMSNotification implements NotificationCollection {
    private Queue<Notification> smsNotification;

    public SMSNotification() {
        this.smsNotification = new LinkedList<>();
    }

    public void addNotification(String message){
        smsNotification.offer(new Notification(message));
    }

    @Override
    public Iterator<Notification> createIterator() {
        return new EmailNotificationIterator(smsNotification);
    }
    private class EmailNotificationIterator implements Iterator<Notification>{
        private int position=0;
        private Queue<Notification> smsNotifications;
        public EmailNotificationIterator(Queue<Notification> smsNotifications) {
            this.smsNotifications = smsNotifications;
        }
        @Override
        public boolean hasNext() {
            return !smsNotifications.isEmpty();
        }
        @Override
        public Notification next() {
            return smsNotifications.poll();
        }
    }
}


