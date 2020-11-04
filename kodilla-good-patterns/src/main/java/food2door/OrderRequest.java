
package food2door;

public class OrderRequest {

    private Supplier supplier;
    private Order order;

    public OrderRequest(final Supplier supplier, final Order order) {
        this.supplier = supplier;
        this.order = order;
    }

    public Supplier getSupplier() {    return supplier;     }
    public Order getOrder() {   return order;    }
}
