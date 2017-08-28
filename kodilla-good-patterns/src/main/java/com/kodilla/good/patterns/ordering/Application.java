package com.kodilla.good.patterns.ordering;

public class Application {
    public static void main(String[] args){
        User testUser = new User("aldi");
        ProductOrderService productOrderService = new ProductOrderService(new MailService(),
                new OrderRequest(testUser), new ProductOrderRepository());
        productOrderService.process(new OrderRequest(testUser));
    }
}
