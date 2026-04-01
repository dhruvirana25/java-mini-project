package in.ac.adit.pwj.miniproject.shopping;

import java.util.*;

public class ShoppingCart {

    private Map<Product, Integer> cartItems = new HashMap<>();

    // Inner class
    public class CartOperations {

        public void addItem(Product p, int qty) throws OutOfStockException {
            if (p.stock < qty) {
                throw new OutOfStockException("Not enough stock for " + p.name);
            }
            cartItems.put(p, cartItems.getOrDefault(p, 0) + qty);
            p.stock -= qty;
        }

        public void removeItem(Product p) {
            cartItems.remove(p);
        }

        public void viewCart() {
            if (cartItems.isEmpty()) {
                System.out.println("Cart is empty.");
                return;
            }

            for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
                System.out.println(entry.getKey().name + " x " + entry.getValue());
            }
        }

        public double checkout() {
            double total = 0;

            for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
                total += entry.getKey().price * entry.getValue();
            }
            FileHandler.generateReceipt(cartItems, total);
            cartItems.clear();
            return total;
        }
    }
}
