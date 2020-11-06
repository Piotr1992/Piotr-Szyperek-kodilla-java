package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

//    public void read(List<String> listOfTasks) {

    public void read() {
        System.out.println("Reading: " + tasks.get(tasks.size()-1));
    }

    public void addTask(String Task) {
        tasks.add(Task);
    }
}