package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> oddNumbers = new ArrayList<Integer>();
        for(Integer i: numbers){
            if((i % 2) != 0){
                oddNumbers.add(i);
            }
        }
        return oddNumbers;
    }
}
