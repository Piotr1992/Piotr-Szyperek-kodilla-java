
package food2door;

public class Shop {
    private Producer supplier;
    private Order order;
    public Shop(final Producer supplier, final Order order) {
        this.supplier = supplier;
        this.order = order;
    }
    public void realizeOrder() {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve(supplier, order);
        OrderProcessor orderProcessor= new OrderProcessor(
                new ProductOrderService(),
                new ProductOrderRepository()
        );
        System.out.println("\nBEGIN supply from " + supplier.getNameOfCompany());
        orderProcessor.process(orderRequest);
        System.out.println("\nEND supply from " + supplier.getNameOfCompany());
    }
}
