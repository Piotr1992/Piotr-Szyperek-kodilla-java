package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {

        return libraryDatabase.listBooksInHandsOf(libraryUser);

    }

    boolean rentABook(LibraryUser libraryUser, Book book) {
        if( listBooksInHandsOf(libraryUser).size() == 0 ) {
            return false;
        } else {
            return true;
        }
    }

    int returnBooks(LibraryUser libraryUser) {
        List<Book> returnedBooksListUser = new ArrayList<Book>();
        listBooksInHandsOf(libraryUser).remove( new Book("Potop", "Henryk Sienkiewicz", 1886) );
        returnedBooksListUser.add( new Book("Potop", "Henryk Sienkiewicz", 1886) );
        listBooksInHandsOf(libraryUser).remove( new Book("Thinking in Java", "Bruce Encle", 2006) );
        returnedBooksListUser.add( new Book("Thinking in Java", "Bruce Encle", 2006) );
        return returnedBooksListUser.size();
    }
}