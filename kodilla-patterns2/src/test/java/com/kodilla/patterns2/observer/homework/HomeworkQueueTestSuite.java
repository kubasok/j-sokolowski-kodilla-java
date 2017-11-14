package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        HomeworkQueue jakubHomeworks = new HomeworkQueue("Jakub's Homework");
        HomeworkQueue agataHomeworks = new HomeworkQueue("Agata's Homework");
        Mentor michal = new Mentor("Michal");
        Mentor andrzej = new Mentor("Andrzej");
        jakubHomeworks.registerObserver(michal);
        jakubHomeworks.registerObserver(andrzej);
        agataHomeworks.registerObserver(andrzej);
        //When
        jakubHomeworks.addHomeworkTask("Ad 10.1");
        agataHomeworks.addHomeworkTask("Ad 11.2");
        jakubHomeworks.addHomeworkTask("Ad 10.3");
        agataHomeworks.addHomeworkTask("Ad 11.4");
        //Then
        assertEquals(2, michal.getUpdateCount());
        assertEquals(4, andrzej.getUpdateCount());
    }

}