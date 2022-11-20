package org.example;

import java.util.List;

public interface iCustomer {
    void setCart(iCart cart);

    int getId();

    float buyProduct();
    float addProduct(Product product);
    float removeProduct(Product product);
    List<Product> viewProducts();
    float makePayment( Payment payment);
}
