package org.alien.design.pattern.observer.common.subject;

import org.alien.design.pattern.observer.common.observer.Observer;

import java.util.Vector;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/18
 */
public abstract class Subject {
    private Vector<Observer> observers = new Vector<>();


    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
