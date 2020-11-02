
package Food2Door;

import com.kodilla.good.patterns.challenges.Product;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

    private int numberOrder;
    private LocalDateTime dateCreatedOrder;
    private LocalDateTime dateRealizationOrder;
    private List<Product> listOfProducts;

    public Order(final int numberOrder, final LocalDateTime dateCreatedOrder, final LocalDateTime dateRealizationOrder, final List<Product> listOfProducts) {
        this.numberOrder = numberOrder;
        this.dateCreatedOrder = dateCreatedOrder;
        this.dateRealizationOrder = dateRealizationOrder;
        this.listOfProducts = listOfProducts;
    }

    public int getNumberOrder() {   return numberOrder;     }
    public LocalDateTime getDateCreatedOrder() {    return dateCreatedOrder;    }
    public LocalDateTime getDateRealizationOrder() {    return dateRealizationOrder;    }
    public List<Product> getListOfProducts() {    return listOfProducts;  }
}
