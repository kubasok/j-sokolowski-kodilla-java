package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskToAdd) {
        tasks.add(taskToAdd);
    }
}
