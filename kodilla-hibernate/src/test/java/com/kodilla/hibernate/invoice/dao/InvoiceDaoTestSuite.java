package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;

public class InvoiceDaoTestSuite {

    private static final String NUMBER = "123456789";

    @Autowired
    private InvoiceDao invoiceDao;
    private ItemDao itemDao;
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product pen = new Product("Pen");
        Product books = new Product("Paper");
        Product scissors = new Product("Scissors");

        Item first = new Item(pen, new BigDecimal(5.5), 100, new BigDecimal(550));
        Item second = new Item(books, new BigDecimal(50), 20, new BigDecimal(1000));
        Item third = new Item(scissors, new BigDecimal(10), 50, new BigDecimal(500));

        first.setProduct(pen);
        second.setProduct(books);
        third.setProduct(scissors);

        Invoice invoice = new Invoice(NUMBER, new ArrayList<Item>());
        invoice.getItems().add(first);
        invoice.getItems().add(second);
        invoice.getItems().add(third);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //taskListDao.deleteById(id);
    }
}
