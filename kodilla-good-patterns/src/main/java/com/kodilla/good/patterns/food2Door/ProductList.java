package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
    public List<Product> createList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("apple", "kg"));
        productList.add(new Product("beetroot", "kg"));
        productList.add(new Product("cucumber", ""));
        productList.add(new Product("garlic", ""));
        productList.add(new Product("nut", "g"));
        productList.add(new Product("soy sauce", "l"));
        return productList;
    }
}
