package com.kodilla.good.patterns.ordering;

import com.kodilla.good.patterns.food2Door.Order;
import com.kodilla.good.patterns.food2Door.OrderProcessor;
import com.kodilla.good.patterns.food2Door.Product;
import com.kodilla.good.patterns.food2Door.ProductList;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Food2DoorTestSuite {

    @Test
    public void testOrdering(){
        List<Product> testProductList = new ProductList().productList;
        Product testProduct0 = testProductList.get(0);
        Product testProduct1 = testProductList.get(1);
        Product testProduct2 = testProductList.get(2);
        OrderProcessor orderProcessor = new OrderProcessor();
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
