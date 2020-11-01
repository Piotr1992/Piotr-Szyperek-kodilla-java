
package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        MovieStore ms = new MovieStore();

        String str = ms.getMovies().entrySet().stream()
            .flatMap(s -> s.getValue().stream())
            .collect(Collectors.joining("!"));

        System.out.print(str);

    }
}
