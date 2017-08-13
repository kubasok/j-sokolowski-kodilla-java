package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

import java.lang.String;

public class StreamMain {
    public static void main(String[] args) {
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
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
