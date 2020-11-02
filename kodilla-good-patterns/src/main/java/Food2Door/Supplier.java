
package Food2Door;

import com.kodilla.good.patterns.challenges.Product;

public class Supplier {

    private String nameOfCompany;
    private int quality;
    private String productType;

    Supplier(final String nameOfCompany, final int quality, final String productType) {
        this.nameOfCompany = nameOfCompany;
        this.quality = quality;
        this.productType = productType;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public int getQuality() {
        return quality;
    }

    public String getProductType() {
        return productType;
    }

    public String getInform() {
        return "Name of supplier: " + getNameOfCompany() +
               "Quality: " + getQuality() +
               "Type of product: " + getProductType();
    }

    public void process(Order order) {
        System.out.println("\nDate of order: " + order.getDateCreatedOrder() +
                            "\nDate of realization: " + order.getDateRealizationOrder() +
                            "\nData about products: ");
        order.getListOfProducts().forEach((n) ->
                System.out.println( "Code: " + n.getCode() + "\tName: " + n.getName() + "\tQuantity: " + n.getQuantity() +
                        "\tUnitOfMeasure: " + n.getUnitOfMeasure() + "\tPrice:" + n.getPrice()    )   );
    }

    public boolean realizedOrder() {
        return true;
    }

    public void successRealizedOrder() {
        System.out.println("The order has been successfully completed!");
    }
}
