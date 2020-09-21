
package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public static List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> numbersOddNumbersExterminator = new ArrayList<Integer>();

        for( int number : numbers ) {
            if ( number % 2 == 0 ) {
                numbersOddNumbersExterminator.add(number);
            }
        }

        return numbersOddNumbersExterminator;

    }

}
