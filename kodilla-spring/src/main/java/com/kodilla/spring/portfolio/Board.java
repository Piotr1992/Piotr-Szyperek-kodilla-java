package com.kodilla.spring.portfolio;

public class Board {
    final TaskList toDoList = new TaskList();
    final TaskList inProgressList = new TaskList();
    final TaskList doneList = new TaskList();
    public TaskList getToDoList() {
        return toDoList;
    }
    public TaskList getInProgressList() {
        return inProgressList;
    }
    public TaskList getDoneList() {
        return doneList;
    }
}