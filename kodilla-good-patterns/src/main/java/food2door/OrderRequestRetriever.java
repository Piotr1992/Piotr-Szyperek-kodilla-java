
package food2door;

public class OrderRequestRetriever {
    public OrderRequest retrieve(Supplier supplier, Order order) {
        return new OrderRequest(supplier, order);
    }
}
