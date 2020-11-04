
package food2door;

public class ProductOrderService implements OrderService {

    public boolean order(Supplier getSupplier, Order getOrder) {
        System.out.println(     "\nCreating order in system..." +
                "\nCompany -> Food2Door S.A." +
                "\nAddress e-mail -> biuro@Food2Door.pl " +
                "\nNumber of order -> " + getOrder.getNumberOrder() +
                "\nDate of order -> " + getOrder.getDateCreatedOrder() +
                "\nDate of realization -> " + getOrder.getDateRealizationOrder()    );
        return true;
    }
}
