
package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;

import java.lang.*;
import java.util.*;

public class CalculatorStatistics {

    int numberUsers;
    int numberPosts;
    int numberComments;
    double averageNumberPostsUser;
    double averageNumberCommentsUser;
    double averageNumberCommentsPost;

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
        if( numberPosts==0 || numberUsers==0 ) {
            averageNumberPostsUser = 0;
        } else {
            averageNumberPostsUser = numberPosts / numberUsers;
        }
        if( numberComments==0 || numberUsers==0 ) {
            averageNumberCommentsUser = 0;
        } else {
            averageNumberCommentsUser = numberComments / numberUsers;
        }
        if( numberComments==0 || numberPosts==0 ) {
            averageNumberCommentsPost = 0;
        } else {
            averageNumberCommentsPost = numberComments / numberPosts;
        }
    }

    public void showStatistics() {
        System.out.println("numberUsers : " + numberUsers + "\nnumberPosts : " + numberPosts + "\nnumberComments : " + numberComments);
        System.out.println("averageNumberPostsUser : " + averageNumberPostsUser);
        System.out.println("averageNumberCommentsUser : " + averageNumberCommentsUser);
        System.out.println("averageNumberCommentsPost : " + averageNumberCommentsPost);
    }

}
