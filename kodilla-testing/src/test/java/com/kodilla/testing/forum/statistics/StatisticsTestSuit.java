package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

import static org.mockito.Mockito.*;

public class StatisticsTestSuit {
    @Test
    public void testStatisticsValues(){
//        Given
        Statistics statsMock = mock(Statistics.class);
        when(statsMock.usersNames().size()).thenReturn(100);
        when(statsMock.postsCount()).thenReturn(100);
        when(statsMock.commentsCount()).thenReturn(1000);

        StatisticsCalculator calculator = new StatisticsCalculator();

//        When
        calculator.calculateAdvStatistics(statsMock);

//        Then
        calculator.showStatistics();
        Assert.assertEquals(100,calculator.getUserCount());
        Assert.assertEquals(100,calculator.getPostsNumber());
        Assert.assertEquals(1000,calculator.getCommentsNumber());
        Assert.assertEquals(1,calculator.getPostsPerUser(),1e-15);
        Assert.assertEquals(10,calculator.getCommentsPerUser(),1e-15);
        Assert.assertEquals(10,calculator.getCommentsPerPost(),1e-15);
    }
    @Test
    public void testStatisticsValues2(){
//        Given
        Statistics statsMock = mock(Statistics.class);
        when(statsMock.usersNames().size()).thenReturn(100);
        when(statsMock.postsCount()).thenReturn(1000);
        when(statsMock.commentsCount()).thenReturn(100);

        StatisticsCalculator calculator = new StatisticsCalculator();

//        When
        calculator.calculateAdvStatistics(statsMock);

//        Then
        calculator.showStatistics();
        Assert.assertEquals(100,calculator.getUserCount());
        Assert.assertEquals(1000,calculator.getPostsNumber());
        Assert.assertEquals(100,calculator.getCommentsNumber());
        Assert.assertEquals(10,calculator.getPostsPerUser(),1e-15);
        Assert.assertEquals(1,calculator.getCommentsPerUser(),1e-15);
        Assert.assertEquals(1,calculator.getCommentsPerPost(),1e-15);
    }

    @Test
    public void testStatisticsZeros(){
//        Given
        Statistics statsMock = mock(Statistics.class);
        when(statsMock.usersNames()).thenReturn(Collections.emptyList());
        when(statsMock.postsCount()).thenReturn(0);
        when(statsMock.commentsCount()).thenReturn(0);

        StatisticsCalculator calculator = new StatisticsCalculator();

//        When
        calculator.calculateAdvStatistics(statsMock);

//        Then
        calculator.showStatistics();
        Assert.assertEquals(0,calculator.getUserCount());
        Assert.assertEquals(0,calculator.getPostsNumber());
        Assert.assertEquals(0,calculator.getCommentsNumber());
        Assert.assertEquals(0,calculator.getPostsPerUser(),1e-15);
        Assert.assertEquals(0,calculator.getCommentsPerUser(),1e-15);
        Assert.assertEquals(0,calculator.getCommentsPerPost(),1e-15);
    }

}
