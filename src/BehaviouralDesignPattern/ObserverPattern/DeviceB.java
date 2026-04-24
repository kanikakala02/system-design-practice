package BehaviouralDesignPattern.ObserverPattern;

public class DeviceB implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("DeviceB temperature: " + temperature);
    }
}
