package com.kodilla.spring.Forum;

import com.kodilla.spring.forum.ForumUser;
import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {

    @Test
    public void testCircleLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String testUsername = forumUser.getUsername();
        //Then
        Assert.assertEquals("John Smith", testUsername);
    }
}
