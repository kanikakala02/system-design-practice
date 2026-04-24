package BehaviouralDesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    List<Observer> observers;
    float temperature;
    public WeatherStation(float temperature) {
        this.observers = new ArrayList<>();
        this.temperature = temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }
    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.update(temperature);
        }
    }
}
