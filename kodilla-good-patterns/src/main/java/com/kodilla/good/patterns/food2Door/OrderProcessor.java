package com.kodilla.good.patterns.food2Door;

public class OrderProcessor {
    public boolean processOrder(Order order){
        boolean ordered;
        ordered = order.getProduct().getProvider().process(order.getProduct(), order.getQuantity());
        System.out.println("The order is processed!");
        return ordered;
    }
}
