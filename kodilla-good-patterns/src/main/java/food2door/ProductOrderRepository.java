
package food2door;

public class ProductOrderRepository implements OrderRepository {

    public void createOrder(Supplier getSupplier, Order getOrder) {
        System.out.println(     "\nSuppling product from...\nBelow information:\nName company -> " + getSupplier.getNameOfCompany() +
                "\nAddress -> " + getSupplier.getAddress() + "\tCode of post -> " + getSupplier.getCodePost() +
                "\nE-mail -> " + getSupplier.getAddressEmail() + "\tPhone -> " + getSupplier.getPhone() +
                "\nNumber of order -> " + getOrder.getNumberOrder() +
                "\nDate of order -> " + getOrder.getDateCreatedOrder() +
                "\nDate of realization -> " + getOrder.getDateRealizationOrder() +
                "\nData about products: "       );
        getOrder.getListOfProducts().forEach(
            (n) -> System.out.println( "Type of product -> " + n.getTypeProduct() + "\tQuantity -> " + n.getQuantity() )
        );
    }
}
