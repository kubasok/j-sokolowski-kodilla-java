package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + ": New homework to check: " + homeworkQueue.getName() + "\n" +
                " (total: " + homeworkQueue.getHomeworkTasks().size() + " homework tasks)");
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
