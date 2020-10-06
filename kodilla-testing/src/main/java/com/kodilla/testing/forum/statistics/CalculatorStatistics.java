
package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;

import java.lang.*;
import java.util.*;

public class CalculatorStatistics {

    public double numberUsers;
    public double numberPosts;
    public double numberComments;
    public double averageNumberPostsUser;
    public double averageNumberCommentsUser;
    public double averageNumberCommentsPost;

    public double getAverageNumberPostsUser() {
        return averageNumberPostsUser;
    }

    public double getAverageNumberCommentsUser() {
        return averageNumberCommentsUser;
    }

    public double getAverageNumberCommentsPost() {
        return averageNumberCommentsPost;
    }



    public void calculateAdvStatistics(Statistics statistics) {

        numberUsers = statistics.usersNames().size();
        numberComments = statistics.commentsCount();
        numberPosts = statistics.postsCount();

        if( numberUsers != 0.0 ) {
            averageNumberPostsUser = (double)(numberPosts / numberUsers);
        }
        if( numberUsers != 0.0 ) {
            averageNumberCommentsUser = (double)(numberComments / numberUsers);
        }
        if( numberPosts != 0.0 ) {
            averageNumberCommentsPost = (double)(numberComments / numberPosts);
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
