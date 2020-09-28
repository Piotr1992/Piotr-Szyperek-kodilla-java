
package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.library.LibraryDatabase;

import java.lang.*;
import java.util.*;

public class CalculatorStatistics implements Statistics {

    int numberUsers;
    int numberPosts;
    int numberComments;

    Statistics statisticsDatabase;

    public CalculatorStatistics(Statistics libraryDatabase) {
        this.statisticsDatabase = statisticsDatabase;
    }

    public CalculatorStatistics( int numberUsers, int numberPosts, int numberComments ) {
        this.numberUsers = numberUsers;
        this.numberPosts = numberPosts;
        this.numberComments = numberComments;
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

    double averageNumberPostsUser( double numberUsers, double numberPosts ) {
        double averageNumberPostsUser = numberPosts / numberUsers;
        return round(averageNumberPostsUser, 2);
    }

    double averageNumberCommentsUser( double numberUsers, double numberComments ) {
        double averageNumberCommentsUser = numberComments / numberUsers;
        return round(averageNumberCommentsUser, 2);
    }

    double averageNumberCommentsPost( double numberPosts, double numberComments ) {
        double averageNumberCommentsPost = numberComments / numberPosts;
        return round(averageNumberCommentsPost, 2);
    }

    public List<String> usersNames() {
        List<String> listUsers = new ArrayList<>();
        listUsers.add("JanKowalski1985");
        listUsers.add("MariaNowacka1990");
        listUsers.add("DariuszNawrocki1971");
        listUsers.add("AlicjaNaszewska2000");
        listUsers.add("ZygmundChajko1969");
        return listUsers;
    }

    public int postsCount() {
        int postsCount = numberUsers * numberPosts;
        return postsCount;
    }

    public int commentsCount() {
        int commentsCount = numberUsers * numberComments;
        return commentsCount;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberUsers = statistics.usersNames().size();
        numberPosts = statistics.postsCount();
        numberComments = statistics.commentsCount();
        averageNumberPostsUser(numberUsers, numberPosts);
        averageNumberCommentsUser(numberUsers, numberComments);
        averageNumberCommentsPost(numberPosts, numberComments);
    }

    public void showStatistics() {
        System.out.println("numberUsers : " + numberUsers + "\nnumberPosts : " + numberPosts + "\nnumberComments : " + numberComments);
        System.out.println("averageNumberPostsUser : " + averageNumberPostsUser(numberUsers, numberPosts));
        System.out.println("averageNumberCommentsUser : " + averageNumberCommentsUser(numberUsers, numberComments));
        System.out.println("averageNumberCommentsPost : " + averageNumberCommentsPost(numberPosts, numberComments));
    }



    //  Addictional function rounded double number two places after dot
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}
