package org.example;

public interface iAdmin {
    String addProduct(Product product);

    String removeProduct(Product product);

    String modifyProduct(Product product);

    String makeShipments();

    String confirmDelivery();

    int getId();
}
