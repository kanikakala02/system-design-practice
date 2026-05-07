package BehaviouralDesignPattern.IteratorPattern;

import java.util.Iterator;

public interface NotificationCollection {
    public Iterator<Notification>  createIterator();
}
