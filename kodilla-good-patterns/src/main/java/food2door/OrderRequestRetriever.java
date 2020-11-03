
package food2door;

public class OrderRequestRetriever {
    public OrderRequest retrieve(Producer supplier, Order order) {
        return new OrderRequest(supplier, order);
    }
}
