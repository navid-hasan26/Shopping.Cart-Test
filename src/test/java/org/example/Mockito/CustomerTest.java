package org.example.Mockito;

import org.example.*;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerTest {

    static Customer customer;
    static Shop shop;
    static Product product1;
    static Product product2;
    static Product product3;

    static Payment payment;

    @BeforeAll
    static void setCustomer() {

        payment = Mockito.mock(Payment.class);


        Admin admin = new Admin("Navid");

        customer = new Customer("Navid026");
        shop = Shop.getInstance();
        product1 = new Product("Pen", 20);
        product2 = new Product("Pencil", 30);
        product3 = new Product("Book", 50);
        shop.addAdmin(admin, 123);
        shop.addProduct(product1, admin.getId());
        shop.addProduct(product2, admin.getId());
        shop.addProduct(product3, admin.getId());

        customer.addProduct(product1);
        customer.addProduct(product2);
        System.out.println(customer.addProduct(product3));
        System.out.println(customer.getCart().getProducts().size());

    }
    @Test
    @Order(1)
    void setId() {
        customer.setId(23532, 123);
        assertEquals(23532, customer.getId());
    }
    @Test
    @Order(2)
    void getId() {
        assertEquals(23532, customer.getId());
    }



    @Test
    @Order(3)
    void getName() {
            assertEquals("Navid026", customer.getName());
        }

    @Test
    @Order(4)
    void setName() {
        customer.setName("hlw");
        assertEquals("hlw", customer.getName());

    }

    @Test
    @Order(5)
    void getAddress() {
        assertEquals("Tehran", customer.getAddress());
    }

    @Test
    @Order(6)
    void setAddress() {
        customer.setAddress("Mashhad");
        assertEquals("Mashhad", customer.getAddress());
    }

    @Test
    @Order(7)
    void getPhone() {
        assertEquals("09123456789", customer.getPhone());
    }

    @Test
    @Order(8)
    void setPhone() {
        customer.setPhone("091234567");
        assertEquals("091234567", customer.getPhone());
    }

    @Test
    @Order(9)
    void getCart() {
       assertNotNull(customer.getCart());
    }

    @Test
    void getPayment() {
        Mockito.doReturn(100.0f).when(payment).payment(ArgumentMatchers.any(Float.class));
        Mockito.doReturn(90.0f).when(payment).offers(ArgumentMatchers.any(Float.class), ArgumentMatchers.any(Float.class));
        assertEquals(100.0f, customer.makePayment(payment));
        assertEquals(90.0f, customer.offers(payment));
    }


}