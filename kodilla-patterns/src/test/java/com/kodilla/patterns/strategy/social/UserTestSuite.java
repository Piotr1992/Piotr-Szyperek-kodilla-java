package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenShouldBuy = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldBuy);
        String johnShouldBuy = john.sharePost();
        System.out.println("John should: " + johnShouldBuy);
        String kodillaShouldBuy = kodilla.sharePost();
        System.out.println("Kodilla should: " + kodillaShouldBuy);

        //Then
        assertEquals("Facebook", stevenShouldBuy);
        assertEquals("Twitter", johnShouldBuy);
        assertEquals("Snapchat", kodillaShouldBuy);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShouldBuy = steven.sharePost();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setSocialPublisher(new SnapchatPublisher());
        stevenShouldBuy = steven.sharePost();
        System.out.println("Steven now should: " + stevenShouldBuy);

        //Then
        assertEquals("Snapchat", stevenShouldBuy);
    }
}
