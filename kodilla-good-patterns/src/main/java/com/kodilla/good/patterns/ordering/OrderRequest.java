package com.kodilla.good.patterns.ordering;


import java.util.List;

public class OrderRequest implements OrderService {
    private final List<User> users;
    private final List<Product> products;
    private final User user;
    private final Product product;

    public OrderRequest(User user, Product product) {
        this.user = user;
        this.product = product;
        users = new UserList().getUserList();
        products = new ProductList().getProductList();
    }

    public boolean order() {
        if(users.contains(user) && products.contains(product)){
            return true;
        } else {
            return false;
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }
}
