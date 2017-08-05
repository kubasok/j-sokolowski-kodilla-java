package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.*;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Collection Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Collection Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Collection Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Collection Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> testList = exterminator.exterminate(emptyList);
        System.out.println("Testing: " + emptyList);
        //Then
        System.out.println("Result: " + testList);
        Assert.assertTrue(testList.size()==0);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> normalList = new ArrayList<Integer>();
        Random randomGenerator = new Random();

        for (int i=0; i<10; i++){
            int randomInt = randomGenerator.nextInt(100)+1;
            normalList.add(randomInt);
        }
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> testList = exterminator.exterminate(normalList);
        System.out.println("Testing: " + normalList);
        //Then
        System.out.println("Result: " + testList);
        Assert.assertTrue(testList.size()>0);
    }
}