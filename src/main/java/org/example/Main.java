package org.example;

public class Main {
    public static void main(String[] args) {
        Shop shop   =   Shop.getInstance();
       //ustomer newCustomer = new Customer("Navid_026");
        System.out.println(shop.getAdmins());
    }
}