
package food2door;

public interface Supplier {
    public String getNameOfCompany();
    public String getAddress();
    public String getCodePost();
    public String getAddressEmail();
    public String getPhone();
    public String inform();
    public boolean process(Order order);
}
