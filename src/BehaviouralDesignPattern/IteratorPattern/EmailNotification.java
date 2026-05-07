package BehaviouralDesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmailNotification implements NotificationCollection {
    private List<Notification> emailNotifications;

    public EmailNotification() {
        this.emailNotifications = new ArrayList<>();
    }

    public void addNotification(String message){
        emailNotifications.add(new Notification(message));
    }

    @Override
    public Iterator<Notification> createIterator() {
        return new EmailNotificationIterator(emailNotifications);
    }
    private class EmailNotificationIterator implements Iterator<Notification>{
        private int position=0;
        private List<Notification> emailNotifications;
        public EmailNotificationIterator(List<Notification> emailNotifications) {
            this.emailNotifications = emailNotifications;
        }
        @Override
        public boolean hasNext() {
            return position < emailNotifications.size();
        }
        @Override
        public Notification next() {
            return emailNotifications.get(position++);
        }
    }
}


