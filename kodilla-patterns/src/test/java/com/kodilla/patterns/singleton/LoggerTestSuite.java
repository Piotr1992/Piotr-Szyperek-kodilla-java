package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void logSettingsFile() {
        logger = Logger.INSTANCE;
        logger.log("Save information to file.");
    }

    @Test
    void testGetLastLog(){
        //Given
        //When
        String log = logger.getLastLog();
        System.out.println("Log: " + log);
        //Then
        assertEquals("Save information to file.", log);
    }

}
