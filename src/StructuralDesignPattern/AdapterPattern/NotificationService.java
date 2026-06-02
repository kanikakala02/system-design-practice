package StructuralDesignPattern.AdapterPattern;

public interface NotificationService{
    void send(String to, String message, String subject);
}
