
package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    public boolean order(User getUser, Order getOrder) {
        System.out.println(     "\nOrdering product for..." +
                                "\nName and Surname: " + getUser.getName() + " " + getUser.getSurname() +
                                "\nAddress e-mail: " + getUser.getAddressEmail() +
                                "\nNumber of order: " + getOrder.getNumberOrder() +
                                "\nDate of order: " + getOrder.getDateCreatedOrder()    );
        return true;
    }
}
