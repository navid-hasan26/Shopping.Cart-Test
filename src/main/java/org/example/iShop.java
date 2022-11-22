package org.example;

public interface iShop {
    String addAdmin(iAdmin admin, int adminId);

    String removeAdmin(iAdmin admin, int adminId);

    String addCustomer(iCustomer customer, int adminId);

    String addCarts(iCart cart, int customerId);

    String removeCustomer(iCustomer customer, int adminId);

    String modifyProduct(Product product, int adminId);

    String addProduct(Product product, int adminId);

    String removeProduct(Product product, int adminId);

    String makeShipments(int adminId);

    String confirmDelivery(int adminId);
}
