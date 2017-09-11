package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean executed = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Performing: " + taskName + "\nDestination: " + where + "\nBy: " + using);
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }
}
