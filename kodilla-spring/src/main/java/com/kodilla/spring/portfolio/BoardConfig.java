package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Qualifier("TL1")
    TaskList firstTaskList;
    TaskList secondTaskList;
    TaskList thirdTaskList;

    @Bean
    public Board getReader() {
        return new Board(firstTaskList, secondTaskList, thirdTaskList);
    }

    @Bean(name = "TL1")
    @Scope("prototype")
    public Board getFirstTaskList() {
        return new Board(firstTaskList, secondTaskList, thirdTaskList);
    }

}
