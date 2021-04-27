package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedianTest() {
        // Given
        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book firstBook = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Bruce Enkel", "Thinking in Java", 2009);
        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book secondBook = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Jon Bentley", "Programming Pearls", 2014);
        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book thirdBook = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Jon Duckett", "HTML and CSS: Design and Build Websites", 2021);

        MedianAdapter medianAdapter = new MedianAdapter();
        BookSignature bookSignature = new BookSignature("AFJL-5647");

        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> bookMap = new HashMap<>();
        bookMap.put(bookSignature, firstBook);
        bookMap.put(bookSignature, secondBook);
        bookMap.put(bookSignature, thirdBook);

        // When
        int medianPublicationYear = medianAdapter.medianPublicationYear(bookMap);

        // Then
        System.out.println(medianPublicationYear);
        assertEquals(2014, medianPublicationYear,0);                  // [4]
    }



/*

  @Test
   public void testTotalSalary() {
      // Given
      Workers workers = new Workers();                      // [1]
      SalaryAdapter salaryAdapter = new SalaryAdapter();    // [2]
      // When
      double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());   // [3]
      // Then
      System.out.println(totalSalary);
      assertEquals(totalSalary, 27750, 0);                  // [4]
   }

 */



}
