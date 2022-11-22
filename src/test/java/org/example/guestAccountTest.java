package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class guestAccountTest {

    static Shop shop;
    static guestAccount guest;
    static Admin admin;
    static Product product1;
    static Product product2;
    static Product product3;


    @BeforeAll
    static void init(){
        shop = Shop.getInstance();
        guest = new guestAccount();
        admin = new Admin("navidAdmin");
        shop.addAdmin(admin, 026);
        product1 = new Product("Pen", 20);
        product2 = new Product("Pencil", 30);
        product3 = new Product("Book", 50);
        shop.addProduct(product1, admin.getId());
        shop.addProduct(product2, admin.getId());
        shop.addProduct(product3, admin.getId());
    }
    @Test
    void viewProducts() {
        assertTrue(3<= guest.viewProducts().size());
        assertInstanceOf(Product.class, guest.viewProducts().get(0));
    }

    @Test
    void getRegistered() {
        assertEquals("Success", guest.getRegistered( "navidGuest", admin.getId()));
    }
}