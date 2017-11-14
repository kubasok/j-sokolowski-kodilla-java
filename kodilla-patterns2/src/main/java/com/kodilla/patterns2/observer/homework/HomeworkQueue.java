package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class HomeworkQueue implements Observable {
    private final List<Observer> observers;
    private final Deque<String> homeworkTasks;
    private final String name;

    public HomeworkQueue(String name) {
        observers = new ArrayList<>();
        homeworkTasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addHomeworkTask(String homeworkName) {
        homeworkTasks.offer(homeworkName);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Queue<String> getHomeworkTasks() {
        return homeworkTasks;
    }

    public String getName() {
        return name;
    }
}
