
package com.kodilla.testing.forum.statistics;

import java.util.*;

public interface Statistics {
    CalculatorStatistics cs = new CalculatorStatistics();
    List<String> usersNames();      // list of users names
    int postsCount();               // total quantity of forum posts
    int commentsCount();            // total quantity of forum comments
}