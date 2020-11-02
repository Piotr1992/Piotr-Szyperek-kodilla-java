
package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user = new User("John", "Kowalski", "Centralna 44/23e street Warsaw", "03-213", "kowalski.jan@wp.pl", "123-456-789");

        List<Product> listOfProducts = new ArrayList<Product>();
        listOfProducts.add(new Product("Computer game - Worms","1234567890", 100, 1,"szt."));
        listOfProducts.add(new Product("Cream Nivea-soft","0246813579", 20,1, "g."));
        listOfProducts.add(new Product("Boots Puma","0987654321", 400, 1,"p."));

        Order order = new Order(    27, LocalDateTime.of(2020, 10, 10, 15, 45),
                                    LocalDateTime.of(2020, 10, 17, 8, 30), listOfProducts   );

        return new OrderRequest(user, order);
    }
}
