package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        TaskList tl = context.getBean(TaskList.class);
        tl.addTask("adsg");
        //Then
        tl.read();

    }
}


/*
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

 */