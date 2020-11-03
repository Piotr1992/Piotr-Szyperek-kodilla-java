
package food2door;

public class OrderDto {

    public Producer supplier;
    public Order order;
    public boolean isRealized;

    public OrderDto(final Producer supplier, final Order order, final boolean isRealized) {
        this.supplier = supplier;
        this.order = order;
        this.isRealized = isRealized;
    }

    public Producer getSupplier() {     return supplier;     }
    public Order getOrder() {     return order;     }
    public boolean getRealized() {     return isRealized;     }
}
