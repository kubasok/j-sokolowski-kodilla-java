package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.toDoList.addTask("1 task");
        board.inProgressList.addTask("2 task");
        board.doneList.addTask("3 task");
        //Then
        Assert.assertEquals(board.toDoList.tasks.get(0),"1 task");
        Assert.assertEquals(board.inProgressList.tasks.get(0),"2 task");
        Assert.assertEquals(board.doneList.tasks.get(0),"3 task");

    }
}
