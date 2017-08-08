package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;
import java.lang.*;

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
        List<Integer> emptyList = Collections.emptyList();
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
        normalList.addAll(Arrays.asList(1,2,3,4,5,6));
        Integer[] sampleArray = {2,4,6};
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        List<Integer> testList = exterminator.exterminate(normalList);
        System.out.println("Testing: " + normalList);
        //Then
        System.out.println("Result: " + testList);
        Assert.assertTrue(testList.size()==3);
        Assert.assertArrayEquals(testList.toArray(),sampleArray);
    }
}