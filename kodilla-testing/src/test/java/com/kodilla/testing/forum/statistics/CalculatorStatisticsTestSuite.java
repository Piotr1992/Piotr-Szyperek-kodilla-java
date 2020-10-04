
package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.statistics.Statistics;
import com.kodilla.testing.forum.statistics.CalculatorStatistics;
import org.junit.jupiter.api.extension.*;
import org.mockito.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.*;
import org.mockito.junit.jupiter.*;


@ExtendWith(MockitoExtension.class)
public class CalculatorStatisticsTestSuite {

    @Mock
    private Statistics statisticsDatabaseMock;

    @Mock
    List<Statistics> mockList;

    @BeforeEach
    public void beforeeach() {
        System.out.println("Before each!");
    }

    @Test
    void testCalculateAdvStatisticsNumberPostsEquals0() {
        // Given
        statisticsDatabaseMock = mock(Statistics.class);
        CalculatorStatistics cs = new CalculatorStatistics();
        cs.numberUsers = 13;
        cs.numberPosts = 0;
        cs.numberComments = 234;
/*        List<String> listString = new ArrayList<String>();
        listString.add("AAA");
        listString.add("BBB");
        when(statisticsDatabaseMock.usersNames()).thenReturn(cs.getStatistics().usersNames());          */

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(cs.averageNumberCommentsUser, cs.getAverageNumberCommentsUser());
        assertEquals(cs.averageNumberCommentsPost, cs.getAverageNumberCommentsPost());
        assertEquals(cs.averageNumberPostsUser, cs.getAverageNumberPostsUser());
        cs.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsNumberPostsEquals1000() {
        // Given
        statisticsDatabaseMock = mock(Statistics.class);
        CalculatorStatistics cs = new CalculatorStatistics();
        cs.numberUsers = 22;
        cs.numberPosts = 1000;
        cs.numberComments = 234;

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(cs.averageNumberCommentsUser, cs.getAverageNumberCommentsUser());
        assertEquals(cs.averageNumberCommentsPost, cs.getAverageNumberCommentsPost());
        assertEquals(cs.averageNumberPostsUser, cs.getAverageNumberPostsUser());
        cs.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsNumberCommentsEquals0() {
        // Given
        statisticsDatabaseMock = mock(Statistics.class);
        CalculatorStatistics cs = new CalculatorStatistics();
        cs.numberUsers = 55;
        cs.numberPosts = 36;
        cs.numberComments = 0;

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(cs.averageNumberCommentsUser, cs.getAverageNumberCommentsUser());
        assertEquals(cs.averageNumberCommentsPost, cs.getAverageNumberCommentsPost());
        assertEquals(cs.averageNumberPostsUser, cs.getAverageNumberPostsUser());
        cs.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsNumberCommentsLessThenPosts() {
        // Given
        statisticsDatabaseMock = mock(Statistics.class);
        CalculatorStatistics cs = new CalculatorStatistics();
        cs.numberUsers = 44;
        cs.numberPosts = 33;
        cs.numberComments = 22;

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(cs.averageNumberCommentsUser, cs.getAverageNumberCommentsUser());
        assertEquals(cs.averageNumberCommentsPost, cs.getAverageNumberCommentsPost());
        assertEquals(cs.averageNumberPostsUser, cs.getAverageNumberPostsUser());
        cs.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsNumberCommentsMoreThenPosts() {
        // Given
        statisticsDatabaseMock = mock(Statistics.class);
        CalculatorStatistics cs = new CalculatorStatistics();
        cs.numberUsers = 66;
        cs.numberPosts = 33;
        cs.numberComments = 44;

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(cs.averageNumberCommentsUser, cs.getAverageNumberCommentsUser());
        assertEquals(cs.averageNumberCommentsPost, cs.getAverageNumberCommentsPost());
        assertEquals(cs.averageNumberPostsUser, cs.getAverageNumberPostsUser());
        cs.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsNumberUsersEquals0() {
        // Given
        statisticsDatabaseMock = mock(Statistics.class);
        CalculatorStatistics cs = new CalculatorStatistics();
        cs.numberUsers = 0;
        cs.numberPosts = 51;
        cs.numberComments = 69;

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(cs.averageNumberCommentsUser, cs.getAverageNumberCommentsUser());
        assertEquals(cs.averageNumberCommentsPost, cs.getAverageNumberCommentsPost());
        assertEquals(cs.averageNumberPostsUser, cs.getAverageNumberPostsUser());
        cs.showStatistics();
    }

    @Test
    void testCalculateAdvStatisticsNumberUsersEquals100() {
        // Given
        statisticsDatabaseMock = mock(Statistics.class);
        CalculatorStatistics cs = new CalculatorStatistics();
        cs.numberUsers = 100;
        cs.numberPosts = 96;
        cs.numberComments = 15;
        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(cs.averageNumberCommentsUser, cs.getAverageNumberCommentsUser());
        assertEquals(cs.averageNumberCommentsPost, cs.getAverageNumberCommentsPost());
        assertEquals(cs.averageNumberPostsUser, cs.getAverageNumberPostsUser());
        cs.showStatistics();
    }

}
