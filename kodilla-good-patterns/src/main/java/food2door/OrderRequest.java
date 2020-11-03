
package food2door;

public class OrderRequest {

    private Producer supplier;
    private Order order;

    public OrderRequest(final Producer supplier, final Order order) {
        this.supplier = supplier;
        this.order = order;
    }

    public Producer getSupplier() {    return supplier;     }
    public Order getOrder() {   return order;    }
}
