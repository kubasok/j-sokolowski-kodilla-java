package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){

        IntStream.range(0,numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

        double average = IntStream.of(numbers)
                .average().getAsDouble();
        System.out.println("Average: " + average);
        return average;
    }
}
