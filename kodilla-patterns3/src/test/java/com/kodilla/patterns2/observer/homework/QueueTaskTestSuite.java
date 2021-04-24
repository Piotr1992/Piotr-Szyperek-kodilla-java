package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTaskTestSuite {

    @Test
    public void testCheck() {
        // Given
        QueueTask firstQueueTask = new FirstQueueTask();
        QueueTask secondQueueTask = new SecondQueueTask();
        QueueTask thirdQueueTask = new ThirdQueueTask();
        Mentor firstMentor = new Mentor("Jan Kowalski");
        Mentor secondMentor = new Mentor("Ewa Nowak");
        firstQueueTask.registerObserver(firstMentor);
        secondQueueTask.registerObserver(secondMentor);
        thirdQueueTask.registerObserver(secondMentor);
        // When
        firstQueueTask.sendTask("Calculate average from given numbers: 2, 4, 6 i 8.");
        secondQueueTask.sendTask("Calculate factorial for given numbers: 0, 1, 2, 3.");
        thirdQueueTask.sendTask("Calculate power for given numbers: 12345.");
        // Then
        assertEquals(1, firstMentor.getCheckCount());
        assertEquals(2, secondMentor.getCheckCount());
    }

}
