package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Qualifier("toDoList")
    TaskList toDoList;
    @Qualifier("inProgressList")
    TaskList inProgressList;
    @Qualifier("doneList")
    TaskList doneList;
    @Bean
    @Scope("prototype")
    public Board getBoard() {
        return new Board();
    }
}