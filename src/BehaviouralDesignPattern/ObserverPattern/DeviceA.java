package BehaviouralDesignPattern.ObserverPattern;

public class DeviceA implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Device A is temperature: " + temperature);
    }
}
