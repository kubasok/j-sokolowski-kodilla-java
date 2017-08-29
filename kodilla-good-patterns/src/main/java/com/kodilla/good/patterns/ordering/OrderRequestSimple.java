package com.kodilla.good.patterns.ordering;

public class OrderRequestSimple implements OrderRequest {
    private final User user;
    private final Product product;
    private final int quantity;

    public OrderRequestSimple(final User user, final Product product, final int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
