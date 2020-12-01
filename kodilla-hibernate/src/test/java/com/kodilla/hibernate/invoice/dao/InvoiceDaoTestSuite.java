package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.dao.InvoiceDao;
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

        Item first = new Item(pen, new BigDecimal(5.5), 100, new BigDecimal(550));
        Item second = new Item(books, new BigDecimal(50), 20, new BigDecimal(1000));
        Item third = new Item(scissors, new BigDecimal(10), 50, new BigDecimal(500));

        first.setProduct(pen);
        second.setProduct(books);
        third.setProduct(scissors);

/*        pen.setId(first.getProduct().getId());
        books.setId(second.getProduct().getId());
        scissors.setId(third.getProduct().getId());         */

        Invoice invoice = new Invoice(NUMBER, new ArrayList<Item>());
        invoice.getItems().add(first);
        invoice.getItems().add(second);
        invoice.getItems().add(third);

        first.


        first.setId(invoice.getId());
        second.setId(invoice.getId());
        third.setId(invoice.getId());

        invoice.setNumber(NUMBER);
        invoice.setItems(invoice.getItems());

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
