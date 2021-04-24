package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int checkCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void check(QueueTask queueTask) {
        System.out.println(name + ": New task in queue " + queueTask.getName() + "\n" +
                " (total: " + queueTask.getTasks().size() + " tasks)");
        checkCount++;
    }

    public String getName() {
        return name;
    }

    public int getCheckCount() {
        return checkCount;
    }
}
