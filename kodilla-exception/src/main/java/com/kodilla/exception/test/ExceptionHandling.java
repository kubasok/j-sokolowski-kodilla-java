package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String args[]) {
        SecondChallenge challenge = new SecondChallenge();
        try {
            System.out.println(challenge.probablyIWillThrowException(2,2));
        } catch (Exception e) {
            System.out.println("There is a problem!");
        } finally {
            System.out.println("The end");
        }
    }
}
