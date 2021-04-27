package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistics;

import java.math.BigDecimal;
import java.util.Map;

public class MedianAdaptee extends Statistics implements BookStatistics {

    Statistics statistics = new Statistics();
    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        int sum = 0;
        for (Book book : books.values()) {
            System.out.println(book);
            sum += book.getYearOfPublication();
        }
//        books.values().size();
//        books.values().stream().count();
        return sum;
    }


}
