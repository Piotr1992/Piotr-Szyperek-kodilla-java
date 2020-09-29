
package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.CalculatorStatistics;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorStatisticsTestSuite {

    @Mock
    private Statistics statisticsDatabaseMock;

    @BeforeEach
    public void before() {
        System.out.println("before each!");
    }

    @AfterEach
    public void after() {
        System.out.println("after each!");
    }

    @Test
    void testCalculateAdvStatisticsNumberPostsEquals0() {
        // Given
        CalculatorStatistics calculatorStatistics = new CalculatorStatistics();
        //when(statisticsDatabaseMock.usersNames()).thenReturn(11);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(0);
        //when(statisticsDatabaseMock.commentsCount()).thenReturn(34);

        // When
        calculatorStatistics.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(0, calculatorStatistics.numberPosts);
    }

    @Test
    void testCalculateAdvStatisticsNumberPostsEquals1000() {
        // Given
        CalculatorStatistics calculatorStatistics = new CalculatorStatistics();
        //when(statisticsDatabaseMock.usersNames()).thenReturn(11);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(0);
        //when(statisticsDatabaseMock.commentsCount()).thenReturn(34);

        // When
        calculatorStatistics.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(1000, calculatorStatistics.numberPosts);
    }

    @Test
    void testCalculateAdvStatisticsNumberCommentsEquals0() {
        // Given
        CalculatorStatistics calculatorStatistics = new CalculatorStatistics();
        //when(statisticsDatabaseMock.usersNames()).thenReturn(11);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(0);
        //when(statisticsDatabaseMock.commentsCount()).thenReturn(34);

        // When
        calculatorStatistics.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(0, calculatorStatistics.numberComments);
    }

    @Test
    void testCalculateAdvStatisticsNumberCommentsLessThenPosts() {
        // Given
        CalculatorStatistics calculatorStatistics = new CalculatorStatistics();
        //when(statisticsDatabaseMock.usersNames()).thenReturn(11);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(0);
        //when(calculatorStatistics.numberComments).thenReturn(34);

        // When
        calculatorStatistics.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(calculatorStatistics.numberPosts+1, calculatorStatistics.numberComments);
    }

    @Test
    void testCalculateAdvStatisticsNumberCommentsMoreThenPosts() {
        // Given
        CalculatorStatistics calculatorStatistics = new CalculatorStatistics();
        //when(statisticsDatabaseMock.usersNames().size()).thenReturn(11);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(0);
        //when(statisticsDatabaseMock.commentsCount()).thenReturn(34);

        // When
        calculatorStatistics.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(calculatorStatistics.numberPosts-1, calculatorStatistics.numberComments);
    }

    @Test
    void testCalculateAdvStatisticsNumberUsersEquals0() {
        // Given
        CalculatorStatistics calculatorStatistics = new CalculatorStatistics();
        //when(statisticsDatabaseMock.usersNames()).thenReturn(11);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(0);
        //when(statisticsDatabaseMock.commentsCount()).thenReturn(34);

        // When
        calculatorStatistics.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(0, calculatorStatistics.numberUsers);
    }

    @Test
    void testCalculateAdvStatisticsNumberUsersEquals100() {
        // Given
        CalculatorStatistics calculatorStatistics = new CalculatorStatistics();
        //when(statisticsDatabaseMock.usersNames()).thenReturn(11);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(0);
        //when(statisticsDatabaseMock.commentsCount()).thenReturn(34);

        // When
        calculatorStatistics.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(100, calculatorStatistics.numberUsers);
    }

}
