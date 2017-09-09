package com.kodilla.patterns.strategy.social;

public class Millenial extends User {
    public Millenial(String username) {
        super(username);
        this.socialPublisher = new FacebookPublisher();
    }
}
