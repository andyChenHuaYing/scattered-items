package org.nanshan.design.pattern.observer.demo.subject;

import org.nanshan.design.pattern.observer.demo.observer.Observer;

import java.util.Vector;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public abstract class Weather {
    protected String weather;
    protected String temperature;
    protected String airQuality;

    private Vector<Observer> observers = new Vector<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(weather, temperature, airQuality);
        }
    }

    public abstract void updateWeatherSituation(String temperature, String weather, String airQuality);
}
