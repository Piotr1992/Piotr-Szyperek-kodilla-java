
package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.*;



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

        OddNumbersExterminator oddNumber = new OddNumbersExterminator();

        System.out.println("\ntestOddNumbersExterminatorEmptyList:");
        List<Integer> numbers = new ArrayList<Integer>();

        //  GET ITEM
        int j=0;
        System.out.print("Content of list[even numbers] -> [ ");
        for( int i=0; i<numbers.size(); i++ ) {
            System.out.print(numbers.get(i));
            j=i;
            if( j < numbers.size()-1 ) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        System.out.print( "Size of the list -> " + oddNumber.exterminate(numbers).size() );
        System.out.println( "\nList is empty -> " + oddNumber.exterminate(numbers).isEmpty() + "\n" );

    }

    @DisplayName(
            "Check list is corrected."
    )
    @Test
    void testOddNumbersExterminatorNormalList() {

        OddNumbersExterminator oddNumber = new OddNumbersExterminator();

        System.out.println("\ntestOddNumbersExterminatorNormalList:");
        List<Integer> numbers = new ArrayList<Integer>();

        for( int number : numbers ) {
            if ( number % 2 == 0 ) {
                numbers.add(number);
            }
        }

        //  ADD ITEM
        for( int i=1; i<=10; i++ ) {
            numbers.add(i);
        }

        //  GET ITEM
        int j=0;
        System.out.print("Content of list[even and odd numbers] -> [ ");
        for( int i=0; i<numbers.size(); i++ ) {
            System.out.print(numbers.get(i));
            j=i;
            if( j < numbers.size()-1 ) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        System.out.println( "Method exterminate from OddNumbersExterminator -> " +  oddNumber.exterminate(numbers) + "\n");

        numbers.clear();

        //  ADD ITEM
        numbers.add(12);
        numbers.add(16);
        numbers.add(20);

        //  GET ITEM
        System.out.print("Content of list[even numbers] -> [ ");
        for( int i=0; i<numbers.size(); i++ ) {
            System.out.print(numbers.get(i));
            j=i;
            if( j < numbers.size()-1 ) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        System.out.println( "Method exterminate from OddNumbersExterminator -> " +  oddNumber.exterminate(numbers) + "\n");

        numbers.clear();

        //  ADD ITEM
        numbers.add(23);
        numbers.add(35);
        numbers.add(47);

        //  GET ITEM
        System.out.print("Content of list[odd numbers] -> [ ");
        for( int i=0; i<numbers.size(); i++ ) {
            System.out.print(numbers.get(i));
            j=i;
            if( j < numbers.size()-1 ) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        System.out.println( "Method exterminate from OddNumbersExterminator -> " +  oddNumber.exterminate(numbers) + "\n");

    }



}
