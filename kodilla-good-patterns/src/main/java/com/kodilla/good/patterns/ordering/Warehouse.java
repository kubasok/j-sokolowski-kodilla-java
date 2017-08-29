package com.kodilla.good.patterns.ordering;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private final Map<Product, Integer> productMap = new HashMap<>();

    public Warehouse() {
        productMap.put(new Product("beer"), 50);
        productMap.put(new Product("chips"), 100);
        productMap.put(new Product("peanuts"), 130);
        productMap.put(new Product("popcorn"), 30);
        productMap.put(new Product("popcorn"), 30);
    }

    public boolean checkOrderRequest(OrderRequest orderRequest){
        Product requestProduct = orderRequest.getProduct();
        int requestQuantity = orderRequest.getQuantity();

        if (productMap.containsKey(requestProduct)
                && productMap.get(requestProduct) >= requestQuantity) {

                productMap.put(requestProduct, productMap.get(orderRequest.getProduct()) - requestQuantity);
                return true;
        } else {
            return false;
        }
    }

}
