
package food2door;

public class HealthyShop implements Supplier {

    private String nameOfCompany;
    private String address;
    private String codePost;
    private String addressEmail;
    private String phone;

    public HealthyShop(final String nameOfCompany, final String address, final String codePost,
             final String addressEmail, final String phone) {
        this.nameOfCompany = nameOfCompany;
        this.address = address;
        this.codePost = codePost;
        this.addressEmail = addressEmail;
        this.phone = phone;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }
    public String getAddress() {
        return address;
    }
    public String getCodePost() {
        return codePost;
    }
    public String getAddressEmail() {
        return addressEmail;
    }
    public String getPhone() {
        return phone;
    }

    public String inform() {
        return  "\nBelow information about supplier:" +
                "\nName -> " + getNameOfCompany() +
                "\tAddress -> " + getAddress() +
                "\tCode of pos -> " + getCodePost() +
                "\tAddress e-mail -> " + getAddressEmail() +
                "\tPhone -> " + getPhone();
    }

    public boolean process(Order order) {
        System.out.println("\nDate of order -> " + order.getDateCreatedOrder() +
                "\nDate of realization -> " + order.getDateRealizationOrder() +
                "\nData about products -> ");
        order.getListOfProducts().forEach((n) ->
                System.out.println( "Type of product -> " + n.getTypeProduct() + "\t\tQuantity -> " + n.getQuantity()   )   );
        return true;
    }
}
