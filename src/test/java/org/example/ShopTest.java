package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ShopTest {

    static Shop shop;
    static Admin admin;
    static Admin admin2;
    static Product product1;
    static Product product2;
    static Product product3;
    static Product product4;


    static Customer customer1;
    static Customer customer2;

    static iCart cart;
    static iCart cart2;




    @BeforeAll
    static void init() {
        shop = Shop.getInstance();
        admin = new Admin("navidAdmin1");
        admin2 = new Admin("navidAdmin2");

        product1 = new Product("Pen", 20);
        product2 = new Product("Pencil", 30);
        product3 = new Product("Book", 50);
        product4 = new Product("Book", 70);

        customer1 = new Customer("navid");
        customer2 = new Customer("navid2");
    }
    @Test
    @Order(1)
    void addAdmin() {
        assertEquals("Failed", shop.addAdmin(admin, 123));
        assertEquals("Success", shop.addAdmin(admin, 1234));
        assertEquals("Success", shop.addAdmin(admin2, admin.getId()));
    }

    @Test
    @Order(2)
    void getAdmins() {
        assertNotNull(shop.getAdmins().size());
    }

    @Test
    @Order(3)
    void removeAdmin() {
        assertEquals("Failed",shop.removeAdmin(admin,2357));
        assertEquals("Success",shop.removeAdmin(admin,1234));
    }


    @Test
    @Order(4)
    void addCustomer() {
        assertEquals("Failed",shop.addCustomer(customer1, 2357));
        assertEquals("Failed",shop.addCustomer(customer1, admin.getId()));
        assertEquals("Success",shop.addCustomer(customer1, admin2.getId()));
        assertTrue(1<=shop.getCustomers().size());
        assertEquals("Success",shop.addCustomer(customer2, admin2.getId()));
        assertTrue(2<=shop.getCustomers().size());
    }

    @Test
    @Order(5)
    void getCustomers() {
        assertTrue(2<=shop.getCustomers().size());

    }
    @Test
    @Order(6)
    void addProduct() {
        assertEquals("Failed",shop.addProduct(product1, 2357));
        assertEquals("Failed",shop.addProduct(product1, admin.getId()));
        assertEquals("Success",shop.addProduct(product1, admin2.getId()));
        assertTrue(1<=shop.getProducts().size());
        assertEquals("Success",shop.addProduct(product2, admin2.getId()));
        assertTrue(2<=shop.getProducts().size());
        assertEquals("Success",shop.addProduct(product3, admin2.getId()));
        assertTrue(3<=shop.getProducts().size());
        assertEquals("Success",shop.addProduct(product4, admin2.getId()));
        assertTrue(4<=shop.getProducts().size());
    }

    @Test
    @Order(7)
    void getProducts() {
        assertNotNull(shop.getProducts().size());
    }

    @Test
    @Order(8)
    void addCarts() {
        assertEquals("Failed",shop.addCarts(cart, 2357));
        assertEquals("Failed",shop.addCarts(cart, admin.getId()));
        assertEquals("Success",shop.addCarts(cart, customer1.getId()));
        assertEquals(1,shop.getCarts().size());
        assertEquals("Success",shop.addCarts(cart2, customer1.getId()));
        assertEquals(2,shop.getCarts().size());
    }




    @Test
    @Order(9)
    void getCarts() {
        assertEquals(2,shop.getCarts().size());
    }


    @Test
    @Order(10)
    void removeCustomer() {
        assertEquals("Failed",shop.removeCustomer(customer1, 2357));
        assertEquals("Failed",shop.removeCustomer(customer1, admin.getId()));
        assertEquals("Success",shop.removeCustomer(customer1, admin2.getId()));
        assertTrue(shop.getProducts().size()>0);
    }


    @Test
    @Order(11)
    void removeProduct() {
        assertEquals("Failed",shop.removeProduct(product1, 2357));
        assertEquals("Failed",shop.removeProduct(product1, admin.getId()));
        assertEquals("Success",shop.removeProduct(product1, admin2.getId()));
        assertEquals(3,shop.getProducts().size());
    }

    @Test
    @Order(12)
    void makeShipments() {
        assertEquals("Failed",shop.makeShipments(2357));
        assertEquals("Failed",shop.makeShipments(admin.getId()));
        assertEquals("Success",shop.makeShipments(admin2.getId()));
    }

    @Test
    @Order(13)
    void confirmDelivery() {
        assertEquals("Failed",shop.confirmDelivery(2357));
        assertEquals("Failed",shop.confirmDelivery(admin.getId()));
        assertEquals("Success",shop.confirmDelivery(admin2.getId()));
    }

    @Test
    @Order(14)
    void modifyProduct() {
        assertEquals("Failed",shop.modifyProduct(product1, 2357));
        assertEquals("Failed",shop.modifyProduct(product1, admin.getId()));
        assertEquals("Success",shop.modifyProduct(product1, admin2.getId()));
    }
}