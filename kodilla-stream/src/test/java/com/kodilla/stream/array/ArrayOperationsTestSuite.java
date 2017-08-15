package com.kodilla.stream.array;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.List;

public class ArrayOperationsTestSuite {
    @Test
     public void testGetAverage() {
        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7 , 8 , 9, 10, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayOperations.getAverage(myArray);
    }
}
