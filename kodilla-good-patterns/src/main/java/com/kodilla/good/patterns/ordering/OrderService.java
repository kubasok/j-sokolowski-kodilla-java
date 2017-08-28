package com.kodilla.good.patterns.ordering;

import java.util.List;

public interface OrderService {
    boolean order();
    List<User> getUsers();
    List<Product> getProducts();
    User getUser();
    Product getProduct();
}
