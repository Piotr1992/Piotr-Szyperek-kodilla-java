package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.doTask(TaskFactory.DRIVING);
        //Then
        assertTrue(drivingTask.executeTask());
        assertEquals("Delivery of product", drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.doTask(TaskFactory.PAINTING);
        //Then
        assertTrue(paintingTask.executeTask());
        assertEquals("Draw a portrait", paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.doTask(TaskFactory.SHOPPING);
        //Then
        assertTrue(shoppingTask.executeTask());
        assertEquals("Do a shopping", shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }
}