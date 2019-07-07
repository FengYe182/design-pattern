package com.fengye.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Subject
 * @Description
 */
public class Subject {
    int state;
    List<Observer> observers = new ArrayList<>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
