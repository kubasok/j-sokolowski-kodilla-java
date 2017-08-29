package com.kodilla.good.patterns.ordering;

import org.junit.Assert;
import org.junit.Test;

public class OrderTestSuite {
    @Test
    public void testOrderingTrue(){
        User testUser = new User("aldi");
        Product testProduct = new Product("chips");
        OrderRequest testOrder = new OrderRequestSimple(testUser, testProduct, 12);
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProductOrderRepository());
        ProductOrderDto testDto = orderProcessor.process(testOrder);
        Assert.assertTrue(testDto.getOrdered());
        Assert.assertEquals(testDto.getProduct(),testProduct);
        Assert.assertEquals(testDto.getUser(),testUser);
        Assert.assertEquals(testDto.getQuantity(),testOrder.getQuantity());
    }

    @Test
    public void testOrderingFalseQuantity(){
        User testUser = new User("aldi");
        Product testProduct = new Product("beer");
        OrderRequest testOrder = new OrderRequestSimple(testUser, testProduct, 120);
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProductOrderRepository());
        ProductOrderDto testDto = orderProcessor.process(testOrder);
        Assert.assertFalse(testDto.getOrdered());
        Assert.assertEquals(testDto.getProduct(),testProduct);
        Assert.assertEquals(testDto.getUser(),testUser);
        Assert.assertEquals(testDto.getQuantity(),testOrder.getQuantity());
    }

    @Test
    public void testOrderingFalseProduct(){
        User testUser = new User("aldi");
        Product testProduct = new Product("test");
        OrderRequest testOrder = new OrderRequestSimple(testUser, testProduct, 12);
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProductOrderRepository());
        ProductOrderDto testDto = orderProcessor.process(testOrder);
        Assert.assertFalse(testDto.getOrdered());
        Assert.assertEquals(testDto.getProduct(),testProduct);
        Assert.assertEquals(testDto.getUser(),testUser);
        Assert.assertEquals(testDto.getQuantity(),testOrder.getQuantity());
    }

    @Test
    public void testOrderingSeveralOrdersTrue(){
        User testUser = new User("aldi");
        Product testProduct = new Product("chips");
        OrderRequest testOrder = new OrderRequestSimple(testUser, testProduct, 100);
        OrderProcessor orderProcessor = new OrderProcessor(new MailService(),
                new ProductOrderRepository());
        ProductOrderDto testDto = orderProcessor.process(testOrder);

        User testUser2 = new User("Bogdan");
        OrderRequest testOrder2 = new OrderRequestSimple(testUser2, testProduct, 100);
        ProductOrderDto testDto2 = orderProcessor.process(testOrder2);

        Assert.assertFalse(testDto2.getOrdered());
        Assert.assertEquals(testDto2.getProduct(),testProduct);
        Assert.assertEquals(testDto2.getUser(),testUser2);
        Assert.assertEquals(testDto.getQuantity(),testOrder.getQuantity());
    }
}
