
package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;

import java.lang.*;
import java.util.*;

public class CalculatorStatistics {

    public int numberUsers;
    public int numberPosts;
    public int numberComments;
    public double averageNumberPostsUser;
    public double averageNumberCommentsUser;
    public double averageNumberCommentsPost;
//    Statistics statistics;

    public double getAverageNumberPostsUser() {
        return averageNumberPostsUser;
    }

    public double getAverageNumberCommentsUser() {
        return averageNumberCommentsUser;
    }

    public double getAverageNumberCommentsPost() {
        return averageNumberCommentsPost;
    }

    public int getNumberUsers() {
        return numberUsers;
    }

    public int getNumberPosts() {
        return numberPosts;
    }

    public int getNumberComments() {
        return numberComments;
    }

/*    public Statistics getStatistics() {
        return statistics;
    }           */

    public void calculateAdvStatistics(Statistics statistics) {
        if( numberUsers != 0 && numberPosts != 0 ) {
/*            getStatistics().usersNames().add("AAA");
            getStatistics().usersNames().add("CCC");                */
            averageNumberPostsUser = numberPosts / numberUsers;
            averageNumberCommentsUser = numberComments / numberUsers;
            averageNumberCommentsPost = numberComments / numberPosts;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorStatistics that = (CalculatorStatistics) o;
        return numberUsers == that.numberUsers &&
                numberPosts == that.numberPosts &&
                numberComments == that.numberComments &&
                Double.compare(that.averageNumberPostsUser, averageNumberPostsUser) == 0 &&
                Double.compare(that.averageNumberCommentsUser, averageNumberCommentsUser) == 0 &&
                Double.compare(that.averageNumberCommentsPost, averageNumberCommentsPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberUsers, numberPosts, numberComments, averageNumberPostsUser, averageNumberCommentsUser, averageNumberCommentsPost);
    }

    public void showStatistics() {
        System.out.println("numberUsers : " + numberUsers + "\nnumberPosts : " + numberPosts + "\nnumberComments : " + numberComments);
        System.out.println("averageNumberPostsUser : " + averageNumberPostsUser);
        System.out.println("averageNumberCommentsUser : " + averageNumberCommentsUser);
        System.out.println("averageNumberCommentsPost : " + averageNumberCommentsPost);
    }

}
