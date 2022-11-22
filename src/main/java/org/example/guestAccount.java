package org.example;
import java.util.List;

public class guestAccount {
    public List<Product> viewProducts(){
        return Shop.getInstance().getProducts();
    }
    public String getRegistered(String name,int adminId ){

        return Shop.getInstance().addCustomer(new Customer(name),adminId);
    }
}
