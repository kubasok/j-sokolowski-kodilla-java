package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class InvoiceDaoTestSuite {

//    @Autowired
//    private InvoiceDao invoiceDao;
//    @Autowired
//    private ProductDao productDao;
//    @Autowired
//    private ItemDao itemDao;
//
//    @Test
//    public void testInvoiceDaoSave() {
//        //Given
//        Invoice invoice = new Invoice("1");
//        Product product = new Product("Test Product");
//        Product product2 = new Product("Test Product2");
//        Item item = new Item(new BigDecimal(1), 1, new BigDecimal(1));
//        Item item2 = new Item(new BigDecimal(1), 2, new BigDecimal(2));
//        Item item3 = new Item(new BigDecimal(1), 3, new BigDecimal(3));
//
//        item.setProduct(product);
//        item.setInvoice(invoice);
//        item2.setProduct(product2);
//        item2.setInvoice(invoice);
//        item3.setProduct(product);
//        item3.setInvoice(invoice);
//
//
//        //When
//        invoiceDao.save(invoice);
//        productDao.save(product);
//        productDao.save(product2);
//        itemDao.save(item);
//        itemDao.save(item2);
//        itemDao.save(item3);
//
//        int id = invoice.getId();
//
//        //Then
//        Assert.assertNotEquals(0, id);
//
//        //CleanUp
//        invoiceDao.delete(id);
//        productDao.deleteAll();
//        itemDao.deleteAll();
//    }
}
