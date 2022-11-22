package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart implements iCart {

    private int id;
    private int numberOfProducts;
    private int userId;
    private List<Product> products = new ArrayList<Product>();
    private float totalPrice;

    public Cart(int userId) {
        this.userId = userId;
        this.id = (int) (Math.random() * 1000);
        this.numberOfProducts = 0;
        this.totalPrice = 0;
        this.products = new ArrayList<Product>();
    }


    @Override
    public float addProduct(Product product) {
        this.products.add(product);
        this.numberOfProducts++;
        this.totalPrice += product.getPrice();
        return this.totalPrice;
    }

    @Override
    public float removeProduct(Product product) {
        this.products.remove(product);
        this.numberOfProducts--;
        this.totalPrice -= product.getPrice();

        return this.totalPrice;

    }

    @Override
    public float updateProduct(Product product) {
        this.products.remove(product);
        this.products.add(product);
        this.totalPrice = 0;
        for (Product p : products) {
            this.totalPrice += p.getPrice();
        }

        return this.totalPrice;
    }

    @Override
    public float checkout() {
        float total = 0.0f;
        for (Product p : products) {
            total += p.getPrice();
        }

        return total;

    }

    @Override
    public List<Product> getProducts() {
        return this.products;
    }

    public int getId() {
        return id;
    }


    public int getNumberOfProducts() {
        return numberOfProducts;
    }


    public int setId(int id) {
        return this.id = id;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

}
