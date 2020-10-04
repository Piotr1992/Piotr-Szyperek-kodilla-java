
package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public interface ArrayOperations {

    public static double getAverage(int[] numbers) {

        double averageNumbers = 0.0;

        System.out.print("\nAll numbers from array:");
        IntStream contentArray = IntStream.range(numbers[0], numbers[numbers.length-1]+1);
        contentArray.forEach( System.out::print );

        averageNumbers = IntStream.range(numbers[0], numbers[numbers.length-1]+1).average().getAsDouble();
        System.out.println();

        return averageNumbers;

    }
}
