
package food2door;

public class Shop {
    private Supplier supplier;
    private Order order;
    public Shop(final Supplier supplier, final Order order) {
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
        supplier.process(order);
        System.out.println("\nEND supply from " + supplier.getNameOfCompany());
    }
}
