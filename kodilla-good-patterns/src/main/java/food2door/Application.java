
package food2door;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Producer ExtraFoodShop = new Producer("ExtraFoodShop Sp. z.o.o.", "Wilcza 12 street Cracow", "03-213", "biuro@extrafoodshop.pl", "123-456-789");
        List<Product> listOfProductsExtraFoodShop = new ArrayList<Product>();
        listOfProductsExtraFoodShop.add(new Product("Flour",100));
        listOfProductsExtraFoodShop.add(new Product("Sugar",250));
        listOfProductsExtraFoodShop.add(new Product("Salt",175));
        Order orderExtraFoodShop = new Order(    2, LocalDateTime.of(2020, 3, 3, 6, 4),
                LocalDateTime.of(2020, 3, 6, 6, 30), listOfProductsExtraFoodShop   );

        Producer GlutenFreeShop = new Producer("GlutenFreeShop Sp. z.o.o.", "Rycerska 5 street Wroclaw", "04-567", "biuro@glutenfreeshop.pl", "987-456-321");
        List<Product> listOfGlutenFreeShop = new ArrayList<Product>();
        listOfGlutenFreeShop.add(new Product("Ice-cream",222));
        listOfGlutenFreeShop.add(new Product("Chocolate",333));
        listOfGlutenFreeShop.add(new Product("Baton",111));
        Order orderGlutenFreeShop = new Order(    13, LocalDateTime.of(2020, 6, 12, 23, 45),
                LocalDateTime.of(2020, 6, 14, 8, 0), listOfGlutenFreeShop   );

        Producer HealthyShop = new Producer("HealthyShop Sp. z.o.o.", "Wiejska 33 Poznan", "08-914", "biuro@healthyshop.pl", "456-321-789");
        List<Product> listOfHealthyShop = new ArrayList<Product>();
        listOfHealthyShop.add(new Product("Avocado",200));
        listOfHealthyShop.add(new Product("Mango",175));
        listOfHealthyShop.add(new Product("Papaya",90));
        Order orderHealthyShop = new Order(    25, LocalDateTime.of(2020, 9, 25, 5,39),
                LocalDateTime.of(2020, 9, 29, 5, 59), listOfHealthyShop   );

        Shop supplyExtraFoodShop = new Shop(ExtraFoodShop, orderExtraFoodShop);
        supplyExtraFoodShop.realizeOrder();

        Shop supplyGlutenFreeShop = new Shop(GlutenFreeShop, orderGlutenFreeShop);
        supplyGlutenFreeShop.realizeOrder();

        Shop supplyHealthyShop = new Shop(HealthyShop, orderHealthyShop);
        supplyHealthyShop.realizeOrder();

    }
}