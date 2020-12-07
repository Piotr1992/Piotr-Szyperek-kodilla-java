package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICES")
public class Invoice {
    private int id;
    private String number;
//    private List<Item> items = new ArrayList<>();
    private List<Product> products = new ArrayList<>();

    public Invoice() {
    }

/*    public Invoice(String number, List<Item> items) {
        this.number = number;
        this.items = items;
    }   */

    public Invoice(String number, List<Product> products) {
        this.number = number;
        this.products = products;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }

/*    @OneToMany(
        targetEntity = Item.class,
        cascade = CascadeType.ALL,
        fetch = FetchType.EAGER
    )
    public List<Item> getItems() {
        return items;
    }       */

    @OneToMany(
            targetEntity = Product.class,
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )

    public List<Product> getProducts() {
        return products;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

/*    public void setItems(List<Item> items) {
        this.items = items;
    }       */

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
