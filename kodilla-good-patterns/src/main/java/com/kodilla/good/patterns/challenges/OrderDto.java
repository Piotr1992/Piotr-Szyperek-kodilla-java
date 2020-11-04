
package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public User user;
    public Order order;
    public boolean isStock;

    public OrderDto(final User user, final Order order, final boolean isStock) {
        this.user = user;
        this.order = order;
        this.isStock = isStock;
    }

    public User getUser() {     return user;     }
    public Order getOrder() {     return order;     }
    public boolean isStock() {     return isStock;     }
}
