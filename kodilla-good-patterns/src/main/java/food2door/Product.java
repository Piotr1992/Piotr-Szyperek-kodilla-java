
package food2door;

public class Product {

    private String typeProduct;
    private int quantity;

    public Product(final String typeProduct, final int quantity) {
        this.typeProduct = typeProduct;
        this.quantity = quantity;
    }

    public String getTypeProduct() {  return typeProduct;   }
    public int getQuantity() { return quantity; }
}
