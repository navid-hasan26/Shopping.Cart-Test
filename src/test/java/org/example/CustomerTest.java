package org.example;

import org.junit.jupiter.api.*;
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
    static  void setCustomer(){

        payment= Mockito.mock(Payment.class);


        Admin admin = new Admin("Navid");

        customer= new Customer("Navid026");
        shop = Shop.getInstance();
        product1 = new Product("Pen", 20);
        product2 = new Product("Pencil", 30);
        product3 = new Product("Book", 50);
        shop.addAdmin(admin, 123);
        shop.addProduct(product1,admin.getId());
        shop.addProduct(product2,admin.getId());
        shop.addProduct(product3,admin.getId());

        customer.addProduct(product1);
        customer.addProduct(product2);
        System.out.println( customer.addProduct(product3));
        System.out.println(customer.getCart().getProducts().size());

    }

    @Test
    @Order(1)
    void getId() {
    }

    @Test
    @Order(2)
    void setId() {
    }

    @Test
    @Order(3)
    void getName() {
    }

    @Test
    void setName() {
    }

    @Test
    void getAddress() {
    }

    @Test
    void setAddress() {
    }

    @Test
    void getPhone() {
    }

    @Test
    void setPhone() {
    }

    @Test
    void getCart() {
    }

    @Test
    void setCart() {
    }

    @Test
    void buyProduct() {
    }

    @Test
    void addProduct() {
    }

    @Test
    void removeProduct() {
    }

    @Test
    void viewProducts() {
    }

    @Test
    void makePayment() {
    }

    @Test
    void offers() {
    }
}