
package com.kodilla.exception.test;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import com.kodilla.exception.test.*;

public class probablyIWillThrowException {

    @Test
    public void testProbablyIWillThrowException() {
        //  Given
        SecondChallenge sc = new SecondChallenge();

        //  When & Then
        assertAll(
/*                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(1.0, 2.6)),
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(2.1, 1.5)),
                () -> assertThrows(Exception.class, () -> sc.probablyIWillThrowException(1.9, 1.5)),                */
                () -> Assertions.assertDoesNotThrow(()  -> sc.probablyIWillThrowException(0.9, 1.4))
        );
    }

}
