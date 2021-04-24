package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class QueueTask implements Observable {
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String name;

    public QueueTask(String name) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void sendTask(String command) {
        tasks.add(command);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.check(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
