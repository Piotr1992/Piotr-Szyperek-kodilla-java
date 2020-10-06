
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
    List<String> listString = new ArrayList<String>();

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
        for(int i=0; i<13; i++) {
            listString.add(""+i+"");
        }
        when(statisticsDatabaseMock.usersNames()).thenReturn(listString);
        when(statisticsDatabaseMock.postsCount()).thenReturn(0);
        when(statisticsDatabaseMock.commentsCount()).thenReturn(234);

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(18.0, cs.getAverageNumberCommentsUser());
        assertEquals(0.0, cs.getAverageNumberCommentsPost());
        assertEquals(0.0, cs.getAverageNumberPostsUser());
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
        for(int i=0; i<22; i++) {
            listString.add(""+i+"");
        }
        when(statisticsDatabaseMock.usersNames()).thenReturn(listString);
        when(statisticsDatabaseMock.postsCount()).thenReturn(1000);
        when(statisticsDatabaseMock.commentsCount()).thenReturn(234);

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(10.636363636363637, cs.getAverageNumberCommentsUser());
        assertEquals(0.234, cs.getAverageNumberCommentsPost());
        assertEquals(45.45454545454545, cs.getAverageNumberPostsUser());
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
        for(int i=0; i<55; i++) {
            listString.add(""+i+"");
        }
        when(statisticsDatabaseMock.usersNames()).thenReturn(listString);
        when(statisticsDatabaseMock.postsCount()).thenReturn(36);
        when(statisticsDatabaseMock.commentsCount()).thenReturn(0);

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(0.0, cs.getAverageNumberCommentsUser());
        assertEquals(0.0, cs.getAverageNumberCommentsPost());
        assertEquals(0.6545454545454545, cs.getAverageNumberPostsUser());
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
        for(int i=0; i<44; i++) {
            listString.add(""+i+"");
        }
        when(statisticsDatabaseMock.usersNames()).thenReturn(listString);
        when(statisticsDatabaseMock.postsCount()).thenReturn(33);
        when(statisticsDatabaseMock.commentsCount()).thenReturn(22);

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(0.5, cs.getAverageNumberCommentsUser());
        assertEquals(0.6666666666666666, cs.getAverageNumberCommentsPost());
        assertEquals(0.75, cs.getAverageNumberPostsUser());
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
        for(int i=0; i<66; i++) {
            listString.add(""+i+"");
        }
        when(statisticsDatabaseMock.usersNames()).thenReturn(listString);
        when(statisticsDatabaseMock.postsCount()).thenReturn(33);
        when(statisticsDatabaseMock.commentsCount()).thenReturn(44);

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(0.6666666666666666, cs.getAverageNumberCommentsUser());
        assertEquals(1.3333333333333333, cs.getAverageNumberCommentsPost());
        assertEquals(0.5, cs.getAverageNumberPostsUser());
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
        when(statisticsDatabaseMock.usersNames()).thenReturn(listString);
        when(statisticsDatabaseMock.postsCount()).thenReturn(51);
        when(statisticsDatabaseMock.commentsCount()).thenReturn(69);

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(0.0, cs.getAverageNumberCommentsUser());
        assertEquals(1.3529411764705883, cs.getAverageNumberCommentsPost());
        assertEquals(0.0, cs.getAverageNumberPostsUser());
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
        for(int i=0; i<100; i++) {
            listString.add(""+i+"");
        }
        when(statisticsDatabaseMock.usersNames()).thenReturn(listString);
        when(statisticsDatabaseMock.postsCount()).thenReturn(96);
        when(statisticsDatabaseMock.commentsCount()).thenReturn(15);

        //When
        cs.calculateAdvStatistics(statisticsDatabaseMock);

        // Then
        assertEquals(0.15, cs.getAverageNumberCommentsUser());
        assertEquals(0.15625, cs.getAverageNumberCommentsPost());
        assertEquals(0.96, cs.getAverageNumberPostsUser());
        cs.showStatistics();
    }

}
