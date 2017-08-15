package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;

import java.lang.String;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        /*Poem beautifier task*/
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Piękny wiersz",(poem) -> "ABC " + poem + " ABC");
        poemBeautifier.beautify("Piękny wiersz",(poem) -> poem.toUpperCase());

        poemBeautifier.beautify("Piękny wiersz",(poem) -> poem + "\n" + poem + "\n" + poem);
        poemBeautifier.beautify("Piękny wiersz",(poem) -> {
            String newPoem = "";
            for (char character:poem.toCharArray()) {
                newPoem = newPoem + character + character;
            }
            return newPoem;
        });

        /*Numbers generator task*/
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        /*People list task*/
        People.getList().stream().map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        /*Book directory task*/
        BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        /*Book directory task no.2*/
        BookDirectory theBookDirectory1 = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory1.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        /*Task 7.3. Forum user list*/
        Forum myForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfForumUsers = Forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> (forumUser.getBirthdate()).isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("\n# elements: " + theResultMapOfForumUsers.size());
        theResultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
