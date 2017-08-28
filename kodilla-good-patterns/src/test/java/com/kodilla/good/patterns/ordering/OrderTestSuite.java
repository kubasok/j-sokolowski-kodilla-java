package com.kodilla.good.patterns.ordering;

import org.junit.Assert;
import org.junit.Test;

public class OrderTestSuite {
    @Test
    public void testOrderingTrue(){
        User testUser = new User("aldi");
        Product testProduct = new Product("dishwasher");
        OrderService testOrder = new OrderRequest(testUser, testProduct);
        ProductOrderService productOrderService = new ProductOrderService(new MailService(),
                new ProductOrderRepository());
        ProductOrderDto testDto = productOrderService.process(testOrder);
        Assert.assertTrue(testDto.getIsOrdered());
        Assert.assertEquals(testDto.getProduct(),testProduct);
        Assert.assertEquals(testDto.getUser(),testUser);
    }

    @Test
    public void testOrderingFalseUser(){
        User testUser = new User("test");
        Product testProduct = new Product("dishwasher");
        OrderService testOrder = new OrderRequest(testUser, testProduct);
        ProductOrderService productOrderService = new ProductOrderService(new MailService(),
                new ProductOrderRepository());
        ProductOrderDto testDto = productOrderService.process(testOrder);
        Assert.assertFalse(testDto.getIsOrdered());
        Assert.assertEquals(testDto.getProduct(),testProduct);
        Assert.assertEquals(testDto.getUser(),testUser);
    }

    @Test
    public void testOrderingFalseProduct(){
        User testUser = new User("aldi");
        Product testProduct = new Product("test");
        OrderService testOrder = new OrderRequest(testUser, testProduct);
        ProductOrderService productOrderService = new ProductOrderService(new MailService(),
                new ProductOrderRepository());
        ProductOrderDto testDto = productOrderService.process(testOrder);
        Assert.assertFalse(testDto.getIsOrdered());
        Assert.assertEquals(testDto.getProduct(),testProduct);
        Assert.assertEquals(testDto.getUser(),testUser);
    }
}
