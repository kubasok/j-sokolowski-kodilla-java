package com.kodilla.good.patterns.food2Door;

public class ProvHealthyShop implements Shop {
    public boolean process(Product orderedProduct, double quantity){

        System.out.println("The order for: " + quantity + " " + orderedProduct.getName() + " was sent to China. Waiting for approval...");
        return true;
    }

}
