package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board firstBean = context.getBean(Board.class);
//        Board secondBean = context.getBean(Board.class);
//        Board thirdBean = context.getBean(Board.class);

        firstBean.doneList.addTask("First task");
//        secondBean.inProgressList.addTask("Second task");
//        thirdBean.toDoList.addTask("Third task");

        TaskList doneListTaskList = new TaskList();
//        TaskList inProgressListTaskList = new TaskList();
//        TaskList toDoListTaskList = new TaskList();

        //When & Then
        doneListTaskList.read(firstBean.doneList.getTasks());
//        inProgressListTaskList.read(secondBean.inProgressList.getTasks());
//        toDoListTaskList.read(thirdBean.toDoList.getTasks());

    }
}
