package com.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private List<Product> shoppingCart;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.shoppingCart = new ArrayList<>();
    }

    public void addProductToCart(Product product) {
        shoppingCart.add(product);
        System.out.println(product.getName() + " added to the cart.");
    }

    public void removeProductFromCart(Product product) {
        if (shoppingCart.remove(product)) {
            System.out.println(product.getName() + " removed from the cart.");
        } else {
            System.out.println(product.getName() + " not found in the cart.");
        }
    }

    public double calculateTotalCost() {
        return shoppingCart.stream().mapToDouble(Product::getPrice).sum();
    }

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    @Override
    public String toString() {
        return "Customer[ID=" + customerID + ", Name=" + name + "]";
    }
}
