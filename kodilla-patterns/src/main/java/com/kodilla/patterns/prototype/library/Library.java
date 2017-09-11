package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public Book getBook(int bookNumber) {
        Book resultBook = null;
        Iterator<Book> iterator = books.iterator();
        if(bookNumber < books.size()) {
            for(int i = 0; i < bookNumber + 1; i++) {
                resultBook = iterator.next();
            }
        } else {
            resultBook  = null;
        }
        return resultBook;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook : books){
            Book clonedBook = new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDate());
            clonedLibrary.books.add(clonedBook);
        }
        return clonedLibrary;
    }
}
