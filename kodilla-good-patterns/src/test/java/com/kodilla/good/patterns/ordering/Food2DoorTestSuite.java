package com.kodilla.good.patterns.ordering;

import com.kodilla.good.patterns.food2Door.*;
import com.kodilla.good.patterns.food2Door.OrderProcessor;
import com.kodilla.good.patterns.food2Door.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Food2DoorTestSuite {

    @Test
    public void testOrdering(){
        Product testProduct0 = new Product("apple");
        Product testProduct1 = new Product("beetroot");
        Product testProduct2 = new Product("cucumber");

        OrderProcessor orderProcessor = new OrderProcessor(new ShopFinder());

        Order testOrder0 = new Order(testProduct0, 1);
        Order testOrder1 = new Order(testProduct1, 1);
        Order testOrder2 = new Order(testProduct2, 1);

        boolean result0 = orderProcessor.processOrder(testOrder0);
        boolean result1 = orderProcessor.processOrder(testOrder1);
        boolean result2 = orderProcessor.processOrder(testOrder2);

        Assert.assertTrue(result0);
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
    }
}
