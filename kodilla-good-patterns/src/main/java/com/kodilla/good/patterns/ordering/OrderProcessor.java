package com.kodilla.good.patterns.ordering;


public class OrderProcessor {
    private InformationService informationService;
    private OrderRepository orderRepository;
    Warehouse warehouse = new Warehouse();

    public OrderProcessor(final InformationService informationService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDto process(final OrderRequest orderRequest){
        boolean ordered;
        ordered = warehouse.checkOrderRequest(orderRequest);

        if (ordered) {
            orderRepository.createOrder();
        }
        informationService.inform(orderRequest.getUser(), ordered);
        return new ProductOrderDto(orderRequest.getUser(), orderRequest.getProduct(), ordered, orderRequest.getQuantity());
    }

}
