
package food2door;

public class OrderProcessor {

    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isRealized = orderService.order(orderRequest.getSupplier(), orderRequest.getOrder());
        if(isRealized) {
            orderRepository.createOrder(orderRequest.getSupplier(), orderRequest.getOrder());
            System.out.println("The order number " + orderRequest.getOrder().getNumberOrder() + " has been successfully completed!");
            return new OrderDto(orderRequest.getSupplier(), orderRequest.getOrder(), true);
        } else {
            System.out.println("The order number " + orderRequest.getOrder().getNumberOrder() + " was failed!");
            return new OrderDto(orderRequest.getSupplier(), orderRequest.getOrder(), false);
        }
    }
}


