package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertNotEquals;

@SpringBootTest
class InvoiceDaoTestSuite {

    private static final String NUMBER = "123456789";

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product pen = new Product("Pen");
        Product books = new Product("Paper");
        Product scissors = new Product("Scissors");

/*        Item first = new Item(new BigDecimal(5.5), 100, new BigDecimal(550));
        Item second = new Item(new BigDecimal(50), 20, new BigDecimal(1000));
        Item third = new Item(new BigDecimal(10), 50, new BigDecimal(500));

        first.setProduct(pen);
        second.setProduct(books);
        third.setProduct(scissors);             */

/*        Invoice invoice = new Invoice(NUMBER, new ArrayList<Item>());

        invoice.getItems().add(first);
        invoice.getItems().add(second);
        invoice.getItems().add(third);              */

        Invoice invoice = new Invoice(NUMBER, new ArrayList<Product>());

        invoice.getProducts().add(pen);
        invoice.getProducts().add(books);
        invoice.getProducts().add(scissors);

//        invoice.setNumber(NUMBER);

//        invoice.setItems(invoice.getItems());

        invoice.setProducts(invoice.getProducts());

        //When
//        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
//        invoiceDao.deleteById(id);
    }
}
