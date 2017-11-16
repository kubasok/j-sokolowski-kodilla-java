package com.kodilla.patterns2.adapter.bookclassifier;


import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        bookSet.add(new Book("James Joyce", "Ulysses", 1922, "B-1"));
        bookSet.add(new Book("George Orwell", "1984", 1949, "B-2"));
        bookSet.add(new Book("J.R.R. Tolkien", "Lord of the Rings", 1954, "B-3"));
        bookSet.add(new Book("J.K. Rowling", "Harry Potter", 1997, "B-4"));
        bookSet.add(new Book("Suzanne Collins", "The Hunger Games", 2008, "B-5"));
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(1954, median);

    }
}
