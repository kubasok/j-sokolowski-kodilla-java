package com.kodilla.good.patterns.ordering;

import java.util.List;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private List<User> users = new UserList().getUserList();
    private List<Product> products = new ProductList().getProductList();

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest);

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest);
            return new ProductOrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new ProductOrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}
