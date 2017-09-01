package com.kodilla.good.patterns.food2Door;

public class OrderProcessor {
    ShopFinder shopFinder;

    public OrderProcessor(ShopFinder shopFinder) {
        this.shopFinder = shopFinder;
    }

    public boolean processOrder(Order order){
        boolean ordered;
        Product orderedProduct = order.getProduct();
        Shop productProvider = shopFinder.findProvider(orderedProduct);

        ordered = productProvider.process(order.getProduct(), order.getQuantity());
        System.out.println("The order is processed!");
        return ordered;
    }
}
