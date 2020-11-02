
package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    private Order order;

    public OrderRequest(final User user, final Order order) {
        this.user = user;
        this.order = order;
    }

    public User getUser() {    return user;     }
    public Order getOrder() {   return order;    }
}
