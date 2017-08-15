package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String username;
    private final char sex;
    private final LocalDate birthdate;
    private final int numberOfPosts;

    public ForumUser(final int id, final String username, final char sex,
                     final LocalDate birthdate, final int numberOfPosts) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.birthdate = birthdate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
