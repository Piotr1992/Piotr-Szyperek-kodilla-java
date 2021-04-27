package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book bookb = new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book("Eric Matthes", "Python", 2019);
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> setBooks = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclassifier.librarya.Book booka : bookSet) {
            setBooks.put(new BookSignature(booka.getSignature()), bookb);
        }
        return (int)medianPublicationYear(setBooks);
    }

}



/*

   @Override
   public double TotalSalary(String[][] workers, double[] salaries) {
      List<Employee> employeeList = new ArrayList<>();
      for (int n = 0; n < salaries.length; n++) {
         employeeList.add(new Employee(
                 workers[n][0],
                 workers[n][1],
                 workers[n][2],
                 new BigDecimal(salaries[n])));
      }
      return calculateSalaries(employeeList).doubleValue();
   }

*/
