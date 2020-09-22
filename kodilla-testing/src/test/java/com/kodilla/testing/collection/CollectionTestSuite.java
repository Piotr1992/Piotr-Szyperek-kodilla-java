
package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("EmptyList NormalList")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");
    }

    @DisplayName(
            "Check list is empty."
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {

        //  Given
        OddNumbersExterminator oddNumber = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<Integer>();

        //  When
        numbers = oddNumber.exterminate(numbers);

        //  Then
        assertTrue( numbers.isEmpty() );

    }

    @DisplayName(
            "Check list is corrected."
    )
    @Test
    void testOddNumbersExterminatorNormalList() {

        //  Given
        OddNumbersExterminator oddNumber = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<Integer>();

        //  When
        List<Integer> testNumbers = numbers;
        for( int i=1; i<=10; i++ ) {
            numbers.add(i);
        }
        numbers = oddNumber.exterminate(testNumbers);


        //  Then
        assertEquals( 5, numbers.size() );

    }



}
