package org.example;

import java.util.List;

public interface iCart {
    float addProduct(Product product);
    float removeProduct(Product product);

    float updateProduct(Product product);
    float checkout();

    List<Product> getProducts();
    int getId();
    int setId(int id);
}
