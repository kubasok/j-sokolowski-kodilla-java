package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean executed = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Performing: " + taskName + "\nPainting: " + whatToPaint + "\nColor: " + color);
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
