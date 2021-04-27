package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedianTest() {
        // Given
        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book firstBook = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Bruce Enkel", "Thinking in Java", 2009);
        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book secondBook = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Jon Bentley", "Programming Pearls", 2014);
        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book thirdBook = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Jon Duckett", "HTML and CSS: Design and Build Websites", 2021);

        MedianAdapter medianAdapter = new MedianAdapter();
        BookSignature firstBookSignature = new BookSignature("AAAA-1111");
        BookSignature secondBookSignature = new BookSignature("BBBB-2222");
        BookSignature thirdBookSignature = new BookSignature("CCCC-3333");

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookMap = new HashMap<>();
        bookMap.put(firstBookSignature, firstBook);
        bookMap.put(secondBookSignature, secondBook);
        bookMap.put(thirdBookSignature, thirdBook);

        // When
        int medianPublicationYear = medianAdapter.medianPublicationYear(bookMap);

        // Then
        System.out.println(medianPublicationYear);
        assertEquals(2014, medianPublicationYear,0);
    }

}
