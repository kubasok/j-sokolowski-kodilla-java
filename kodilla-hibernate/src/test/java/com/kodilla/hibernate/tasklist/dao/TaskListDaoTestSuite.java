package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Hibernate 101";
    @Test
    public void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("In Progress", DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskLists = taskListDao.findByListName("In Progress");

        //Then
        Assert.assertEquals(1, readTaskLists.size());
        Assert.assertEquals(DESCRIPTION, readTaskLists.get(0).getDescription());

        //CleanUp
        int id = readTaskLists.get(0).getId();
        taskListDao.delete(id);
    }
}
