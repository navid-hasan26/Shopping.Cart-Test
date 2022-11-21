package org.example;

public class Main {
    public static void main(String[] args) {
        Shop shop   =   Shop.getInstance();
        System.out.println(shop.getAdmins());
    }
}