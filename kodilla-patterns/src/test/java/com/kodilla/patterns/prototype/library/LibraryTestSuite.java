package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library = new Library("First Library");
        Book bookJava = new Book("Thinking in Java", "Bruce Eckel", LocalDate.of(2006, 6, 30));
        Book bookCSharp = new Book("C# 3.0 dla .NET 3.5 Księga Eksperta", "Joe Mayo", LocalDate.of(2008, 4, 15));
        Book bookSQL = new Book("SQL Praktyczny kurs", "Marcin Szeliga", LocalDate.of(2011, 9, 5));
        library.getBooks().add(bookJava);
        library.getBooks().add(bookCSharp);
        library.getBooks().add(bookSQL);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Third Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(bookCSharp);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(2, library.getBooks().size());
        assertEquals(2, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
