package com.kodilla.good.patterns.ordering;

public interface OrderRequest {
    User getUser();
    Product getProduct();
    int getQuantity();
}
