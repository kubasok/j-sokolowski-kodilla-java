package com.kodilla.good.patterns.ordering;

public class ProductOrderRepository implements OrderRepository{
    public boolean createOrder(OrderService orderService){
        System.out.println("The order is created!");
        return true;
    }
}
