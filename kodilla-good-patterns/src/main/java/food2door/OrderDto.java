
package food2door;

public class OrderDto {

    public Supplier supplier;
    public Order order;
    public boolean isRealized;

    public OrderDto(final Supplier supplier, final Order order, final boolean isRealized) {
        this.supplier = supplier;
        this.order = order;
        this.isRealized = isRealized;
    }

    public Supplier getSupplier() {     return supplier;     }
    public Order getOrder() {     return order;     }
    public boolean getRealized() {     return isRealized;     }
}
