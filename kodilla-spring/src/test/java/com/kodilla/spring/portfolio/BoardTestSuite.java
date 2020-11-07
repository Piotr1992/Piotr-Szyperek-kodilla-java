package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.addTask("toDoList");
        board.inProgressList.addTask("inProgressList");
        board.doneList.addTask("doneList");

        //Then
        Assertions.assertEquals(1, board.getToDoList().showSize());
        Assertions.assertEquals(1, board.getInProgressList().showSize());
        Assertions.assertEquals(1, board.getDoneList().showSize());
    }
}
