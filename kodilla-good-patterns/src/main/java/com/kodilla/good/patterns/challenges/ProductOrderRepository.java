
package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements OrderRepository {

    public void createOrder(User getUser, Order getOrder) {
        System.out.println(     "\nCreating order in system...\nBelow information:\nName and Surname: " + getUser.getName() + " " + getUser.getSurname() +
                                "\nAddress: " + getUser.getAddress() + "\tCode of post: " + getUser.getCodePost() +
                                "\nE-mail: " + getUser.getAddressEmail() + "\tPhone: " + getUser.getPhone() +
                                "\nNumber of order: " + getOrder.getNumberOrder() +
                                "\nDate of order: " + getOrder.getDateCreatedOrder() +
                                "\nDate of realization: " + getOrder.getDateRealizationOrder() +
                                "\nData about products: ");

        getOrder.getListOfProducts().forEach((n) ->
                System.out.println( "Code: " + n.getCode() + "\tName: " + n.getName() + "\tQuantity: " + n.getQuantity() +
                                    "\tUnitOfMeasure: " + n.getUnitOfMeasure() + "\tPrice:" + n.getPrice()    )   );
    }
}
