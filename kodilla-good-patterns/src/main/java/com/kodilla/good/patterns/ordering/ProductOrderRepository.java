package com.kodilla.good.patterns.ordering;

public class ProductOrderRepository implements OrderRepository{
    public boolean createOrder(){
        System.out.println("The order is created!");
        return true;
    }
}
