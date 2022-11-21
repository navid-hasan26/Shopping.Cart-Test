package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CartTest {

    static Shop shop;
    static Product product1;
    static Product product2;
    static Product product3;
    static Cart cart;

    @BeforeAll
    static void init() {
        cart = new Cart(100);
        shop = Shop.getInstance();
        product1 = new Product("Pen", 20);
        product2 = new Product("Pencil", 30);
        product3 = new Product("Book", 50);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
    }


    @Test
    @Order(1)
        void addProduct() {
        assertEquals(100,cart.addProduct(product1));
    }

    @Test
    @Order(2)
    void removeProduct() {
        assertEquals(80,cart.removeProduct(product1));
    }

    @Test
    @Order(3)
    void updateProduct() {
        product2.setPrice(50);
        assertEquals(100,cart.updateProduct(product1));
    }

    @Test
    @Order(4)
    void checkout() {
        assertEquals(100,cart.checkout());
    }

    @Test
    void getPruducts() {
        assertEquals(3,cart.getProducts().size());
    }

    @Test
    void getId() {
        assertInstanceOf(Integer.class,cart.getId());
    }

    @Test
    void getNumberOfProducts() {
        assertEquals(3,cart.getNumberOfProducts());
    }



    @Test
    void getTotalPrice() {
        assertEquals(100,cart.getTotalPrice());
    }
}