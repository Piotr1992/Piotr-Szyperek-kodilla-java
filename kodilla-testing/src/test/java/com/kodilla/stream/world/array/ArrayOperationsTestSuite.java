
package com.kodilla.stream.world.array;

import com.kodilla.stream.array.ArrayOperations;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //  Given
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //  When
        double result = ArrayOperations.getAverage(arr);

        //  Then
        assertEquals(5.5, result);

    }

}
