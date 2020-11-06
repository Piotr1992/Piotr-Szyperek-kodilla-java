package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Qualifier("f")
    TaskList firstTaskList;
    @Qualifier("s")
    TaskList secondTaskList;
    @Qualifier("t")
    TaskList thirdTaskList;
    @Bean
    @Scope("prototype")
    public Board getBoard() {
        return new Board(firstTaskList, secondTaskList, thirdTaskList);
    }

}