package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shop implements iShop {

    private static Shop instance = null;
    private Shop() {
        admins.add(new Admin("admin",1234));

    }
    public static Shop getInstance() {
        if(instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    List<iAdmin> admins= new ArrayList<iAdmin>();
    List<iCustomer> customers = new ArrayList<iCustomer>();
    List<Product> products = new ArrayList<Product>();
    List<Cart> carts = new ArrayList<Cart>();

    public List<iAdmin> getAdmins() {
        return admins;
    }



    public List<iCustomer> getCustomers() {
        return customers;
    }


    public List<Product> getProducts() {
        return products;
    }


    public List<Cart> getCarts() {
        return carts;
    }



    @Override
    public String addAdmin(iAdmin admin, int adminId) {
        for (iAdmin admin1:admins) {
            if(admin1.getId()==adminId){
                admins.add(admin);
                return "Success";
            }
        }

        return "Failed";
    }

    @Override
    public String removeAdmin(iAdmin admin, int adminId) {
        for (iAdmin admin1:admins) {
            if(admin1.getId()==adminId){
                admins.remove(admin);
                return "Success";
            }
        }

        return "Failed";
    }

    @Override
    public String addCustomer(iCustomer customer, int adminId) {
        for (iAdmin admin1:admins) {
            if(admin1.getId()==adminId){
                customers.add(customer);
                return "Success";
            }
        }

        return "Failed";
    }

    @Override
    public String addCarts(iCart cart, int customerId) {
        for (iCustomer customer:customers) {
            if(customer.getId()==customerId){
                carts.add((Cart) cart);
                return "Success";
            }
        }

        return "Failed";
    }

    @Override
    public String removeCustomer(iCustomer customer, int adminId) {
        for (iAdmin admin1:admins) {
            if(admin1.getId()==adminId){
                customers.remove(customer);
                return "Success";
            }
        }

        return "Failed";
    }

    @Override
    public String addProduct(Product product, int adminId) {
        for (iAdmin admin1:admins) {
            if(admin1.getId()==adminId){
                products.add(product);
                return "Success";
            }
        }

        return "Failed";
    }

    @Override
    public String removeProduct(Product product, int adminId) {
        for (iAdmin admin1:admins) {
            if(admin1.getId()==adminId){
                products.remove(product);
                return "Success";
            }
        }

        return "Failed";
    }



    @Override
    public String makeShipments(int adminId) {
        for (iAdmin admin1:admins) {
            if(admin1.getId()==adminId){
                return "Success";
            }
        }

        return "Failed";
    }

    @Override
    public String confirmDelivery(int adminId) {
        for (iAdmin admin1:admins) {
            if(admin1.getId()==adminId){
                return "Success";
            }
        }

        return "Failed";
    }

    public String modifyProduct(Product product, int adminId) {
        for (iAdmin admin1:admins) {
            if(admin1.getId()==adminId){
                return "Success";
            }
        }

        return "Failed";
    }


}
