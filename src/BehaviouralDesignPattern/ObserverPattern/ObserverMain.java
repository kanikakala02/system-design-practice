package BehaviouralDesignPattern.ObserverPattern;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherStation weatherStation= new WeatherStation(25);
        DeviceA deviceA = new DeviceA();
        DeviceB deviceB = new DeviceB();
        weatherStation.attach(deviceA);
        weatherStation.attach(deviceB);
        weatherStation.notifyObservers();

        weatherStation.detach(deviceA);
        weatherStation.setTemperature(30);
        weatherStation.notifyObservers();
    }
}
