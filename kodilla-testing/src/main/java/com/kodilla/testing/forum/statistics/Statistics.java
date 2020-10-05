
package com.kodilla.testing.forum.statistics;

import java.util.*;

public interface Statistics {
    CalculatorStatistics cs = new CalculatorStatistics();
    default List<String> usersNames() {
        List<String> listString = new ArrayList<String>();
        String str = "";
        for( int i=0; i<cs.numberUsers; i++ ) {
            str += "A";
            listString.add(str);
        }
        return listString;
    }      // list of users names
    default int postsCount() {
        return cs.numberPosts;
    }               // total quantity of forum posts
    default int commentsCount() {
        return cs.numberComments;
    }             // total quantity of forum comments
}