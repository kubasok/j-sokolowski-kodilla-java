package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator newCalculator = new Calculator();

        int resultAdd = newCalculator.add(5,1);
        int resultSubtract = newCalculator.subtract(5,1);

        if (resultAdd == 6){
            System.out.println("Test Add: OK");
        } else {
            System.out.println("Test Add: Error");
        }

        if (resultSubtract == 4){
            System.out.println("Test Subtract: OK");
        } else {
            System.out.println("Test Subtract: Error");
        }
    }
}
