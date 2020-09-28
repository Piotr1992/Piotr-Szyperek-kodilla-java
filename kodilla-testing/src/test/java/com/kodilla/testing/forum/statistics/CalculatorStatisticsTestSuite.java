
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
        Statistics calculatorStatistics = new CalculatorStatistics(statisticsDatabaseMock);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(calculatorStatistics.numberPosts);

        // When
        CalculatorStatistics firstForum = new CalculatorStatistics(5, 0, 731);

        // Then
        assertEquals(0, firstForum.postsCount());
    }

    @Test
    void testCalculateAdvStatisticsNumberPostsEquals1000() {
        // Given
        Statistics calculatorStatistics = new CalculatorStatistics(statisticsDatabaseMock);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(calculatorStatistics.postsCount());

        // When
        CalculatorStatistics firstForum = new CalculatorStatistics(5, 1000, 731);

        // Then
        assertEquals(5000, firstForum.postsCount());
    }

    @Test
    void testCalculateAdvStatisticsNumberCommentsEquals0() {
        // Given
        Statistics calculatorStatistics = new CalculatorStatistics(statisticsDatabaseMock);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(calculatorStatistics.commentsCount());

        // When
        CalculatorStatistics firstForum = new CalculatorStatistics(5, 1000, 0);

        // Then
        assertEquals(0, firstForum.commentsCount());
    }

    @Test
    void testCalculateAdvStatisticsNumberCommentsLessThenPosts() {
        // Given
        Statistics calculatorStatistics = new CalculatorStatistics(statisticsDatabaseMock);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(calculatorStatistics.commentsCount());

        // When
        CalculatorStatistics firstForum = new CalculatorStatistics(5, 800, 750);

        // Then
        assertEquals(3750, firstForum.commentsCount());
    }

    @Test
    void testCalculateAdvStatisticsNumberCommentsMoreThenPosts() {
        // Given
        Statistics calculatorStatistics = new CalculatorStatistics(statisticsDatabaseMock);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(calculatorStatistics.commentsCount());

        // When
        CalculatorStatistics firstForum = new CalculatorStatistics(5, 750, 800);

        // Then
        assertEquals(4000, firstForum.commentsCount());
    }

    @Test
    void testCalculateAdvStatisticsNumberUsersEquals0() {
        // Given
        Statistics calculatorStatistics = new CalculatorStatistics(statisticsDatabaseMock);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(calculatorStatistics.commentsCount());

        // When
        CalculatorStatistics firstForum = new CalculatorStatistics(0, 750, 800);

        // Then
        assertEquals(0, firstForum.commentsCount());
    }

    @Test
    void testCalculateAdvStatisticsNumberUsersEquals100() {
        // Given
        Statistics calculatorStatistics = new CalculatorStatistics(statisticsDatabaseMock);
        //when(statisticsDatabaseMock.postsCount()).thenReturn(calculatorStatistics.commentsCount());

        // When
        CalculatorStatistics firstForum = new CalculatorStatistics(100, 750, 800);

        // Then
        assertEquals(80000, firstForum.commentsCount());
    }

}
