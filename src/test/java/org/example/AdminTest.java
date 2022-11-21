package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdminTest {

    static Shop shop;
    static Admin admin;
    static Admin admin2;
    static Product product1;
    static Product product2;
    static Product product3;

    @BeforeAll
    static void init(){
        shop = Shop.getInstance();
        admin = new Admin("navidAdmin1");
        admin2 = new Admin("navidAdmin2");
        shop.addAdmin(admin, 026);
        shop.addAdmin(admin2, admin.getId());
        product1 = new Product("Pen", 20);
        product2 = new Product("Pencil", 30);
        product3 = new Product("Book", 50);
    }



    @Test
    @Order(1)
    void getName() {
        assertEquals("navidAdmin1",admin.getName());
        assertInstanceOf(String.class,admin.getName());
    }

    @Test
    @Order(2)
    void setName() {
        admin.setName("navid");
        assertEquals("navid",admin.getName());
    }

    @Test
    @Order(3)
    void addProduct() {
        assertEquals("Success",admin.addProduct(product1));
        assertEquals("Success",admin.addProduct(product2));
        assertEquals("Success",admin.addProduct(product3));
    }

    @Test
    @Order(4)
    void removeProduct() {
        assertEquals("Success",admin.removeProduct(product1));
        assertEquals("Success",admin.removeProduct(product2));
        assertEquals("Success",admin.removeProduct(product3));
    }

    @Test
    @Order(5)
    void modifyProduct() {
        assertEquals("Success",admin.modifyProduct(product1));
        assertEquals("Success",admin.modifyProduct(product2));
        assertEquals("Success",admin.modifyProduct(product3));
    }

    @Test
    @Order(6)
        void makeShipments() {
            assertEquals("Success",admin.makeShipments());
    }

    @Test
    @Order(7)
        void confirmDelivery() {
            assertEquals("Success",admin.confirmDelivery());
        }
}