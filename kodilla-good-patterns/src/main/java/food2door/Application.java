
package food2door;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        Producer newProducer = new Producer("New Producer Sp. z.o.o.", "Nowa 246 street Białystok", "11-002", "biuro@newproducer.pl", "916-782-354");
        List<Product> listOfNewProducer = new ArrayList<Product>();
        listOfNewProducer.add(new Product("Juice",200));
        listOfNewProducer.add(new Product("Milk",175));
        listOfNewProducer.add(new Product("Water",90));
        Order orderNewProducer = new Order(    25, LocalDateTime.of(2020, 9, 25, 5,39),
                LocalDateTime.of(2020, 9, 29, 5, 59), listOfNewProducer   );

        ExtraFoodShop ExtraFoodShop = new ExtraFoodShop("ExtraFoodShop Sp. z.o.o.", "Wilcza 12 street Cracow", "03-213", "biuro@extrafoodshop.pl", "123-456-789");
        List<Product> listOfProductsExtraFoodShop = new ArrayList<Product>();
        listOfProductsExtraFoodShop.add(new Product("Flour",100));
        listOfProductsExtraFoodShop.add(new Product("Sugar",250));
        listOfProductsExtraFoodShop.add(new Product("Salt",175));
        Order orderExtraFoodShop = new Order(    2, LocalDateTime.of(2020, 3, 3, 6, 4),
                LocalDateTime.of(2020, 3, 6, 6, 30), listOfProductsExtraFoodShop   );

        HealthyShop GlutenFreeShop = new HealthyShop("GlutenFreeShop Sp. z.o.o.", "Rycerska 5 street Wroclaw", "04-567", "biuro@glutenfreeshop.pl", "987-456-321");
        List<Product> listOfGlutenFreeShop = new ArrayList<Product>();
        listOfGlutenFreeShop.add(new Product("Ice-cream",222));
        listOfGlutenFreeShop.add(new Product("Chocolate",333));
        listOfGlutenFreeShop.add(new Product("Baton",111));
        Order orderGlutenFreeShop = new Order(    13, LocalDateTime.of(2020, 6, 12, 23, 45),
                LocalDateTime.of(2020, 6, 14, 8, 0), listOfGlutenFreeShop   );

        GlutenFreeShop HealthyShop = new GlutenFreeShop("HealthyShop Sp. z.o.o.", "Wiejska 33 street Poznan", "08-914", "biuro@healthyshop.pl", "456-321-789");
        List<Product> listOfHealthyShop = new ArrayList<Product>();
        listOfHealthyShop.add(new Product("Avocado",200));
        listOfHealthyShop.add(new Product("Mango",175));
        listOfHealthyShop.add(new Product("Papaya",90));
        Order orderHealthyShop = new Order(    25, LocalDateTime.of(2020, 9, 25, 5,39),
                LocalDateTime.of(2020, 9, 29, 5, 59), listOfHealthyShop   );

        Shop supplyNewProducer = new Shop(newProducer, orderNewProducer);
        supplyNewProducer.realizeOrder();

        Shop supplyExtraFoodShop = new Shop(ExtraFoodShop, orderExtraFoodShop);
        supplyExtraFoodShop.realizeOrder();

        Shop supplyGlutenFreeShop = new Shop(GlutenFreeShop, orderGlutenFreeShop);
        supplyGlutenFreeShop.realizeOrder();

        Shop supplyHealthyShop = new Shop(HealthyShop, orderHealthyShop);
        supplyHealthyShop.realizeOrder();

    }
}