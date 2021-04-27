package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> setBooks = new HashMap<>();
        for (com.kodilla.patterns2.adapter.bookclassifier.librarya.Book booka : bookSet) {
            setBooks.put(new BookSignature(booka.getSignature()), new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(booka.getAuthor(), booka.getTitle(), booka.getPublicationYear()));
        }
        return medianPublicationYear(setBooks);
    }

}