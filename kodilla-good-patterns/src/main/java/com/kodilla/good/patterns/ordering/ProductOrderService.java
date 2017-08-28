package com.kodilla.good.patterns.ordering;

import java.util.List;

public class ProductOrderService {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private List<User> users = new UserList().getUserList();
    private List<Product> products = new ProductList().getProductList();

    public ProductOrderService(final InformationService informationService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDto process(final OrderService orderService){
        boolean isOrdered = orderService.order();

        if (isOrdered) {
            informationService.inform(orderService.getUser());
            orderRepository.createOrder(orderService);
            return new ProductOrderDto(orderService.getUser(), orderService.getProduct(), true);
        } else {
            return new ProductOrderDto(orderService.getUser(), orderService.getProduct(), false);
        }
    }

}
