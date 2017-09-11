package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        Library theLibrary = new Library("Fantasy library");
        theLibrary.books.add(new Book("Harry Potter", "J.K. Rowling", LocalDate.of(1997,6,26)));
        theLibrary.books.add(new Book("Lord of the Rings", "J.R.R. Tolkien", LocalDate.of(1954,7,29)));
        theLibrary.books.add(new Book("The Colour of Magic", "Terry Pratchett", LocalDate.of(1983,11,24)));

        //shallow clone of library
        Library clonedLibrary = null;
        try {
            clonedLibrary = theLibrary.shallowCopy();
            clonedLibrary.setName("Fantasy library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(clonedLibrary.books);

        //deep clone of library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = theLibrary.deepCopy();
            deepClonedLibrary.setName("Fantasy library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(deepClonedLibrary.books);

        Assert.assertEquals(3,theLibrary.getBooks().size());
        Assert.assertTrue(theLibrary.getBooks().contains(clonedLibrary.getBook(0)));
        Assert.assertFalse(theLibrary.getBooks().contains(deepClonedLibrary.getBook(0)));

    }
}
