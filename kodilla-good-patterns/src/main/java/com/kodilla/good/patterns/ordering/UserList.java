package com.kodilla.good.patterns.ordering;

import java.util.ArrayList;
import java.util.List;

public class UserList {
    private final List<User> userList = new ArrayList<>();

    public UserList() {
        userList.add(new User("aldi"));
        userList.add(new User("Bogdan"));
        userList.add(new User("kormoran"));
        userList.add(new User("Kant"));
    }

    public List<User> getUserList(){
        return userList;
    }
}
