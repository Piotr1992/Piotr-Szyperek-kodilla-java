
package com.kodilla.exception.test;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.*;

import static org.junit.jupiter.api.Assertions.*;

class probablyIWillThrowException {

    @Test
    public void testProbablyIWillThrowException() {
        //  Given
        SecondChallenge sc = new SecondChallenge();

        //  When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(2.0, 1.5)),
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(0.9, 1.5)),
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(0.0, 0.0)),
                () -> assertDoesNotThrow(()  -> sc.probablyIWillThrowException(1.0, 1.4))
        );
    }
}
