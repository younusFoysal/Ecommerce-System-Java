package Main;
import com.ecommerce.*;
import com.ecommerce.orders.Order;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 800.00);
        Product product2 = new Product(2, "Phone", 500.00);
        Product product3 = new Product(3, "Headphones", 50.00);

        Customer customer = new Customer(101, "Alice");

        System.out.println("Available Products:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        customer.addProductToCart(product1);
        customer.addProductToCart(product3);

        System.out.println("\nShopping Cart:");
        customer.getShoppingCart().forEach(System.out::println);

        System.out.println("\nTotal Cost: $" + customer.calculateTotalCost());

        Order order = new Order(1001, customer, customer.getShoppingCart());
        System.out.println("\nOrder Summary:");
        order.displayOrderSummary();
    }
}
