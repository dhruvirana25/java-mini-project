package in.ac.adit.pwj.miniproject.shopping;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> inventory = new ArrayList<>();

        inventory.add(new Electronics(1, "Laptop", 50000, 5, 2));
        inventory.add(new Clothing(2, "Shirt", 1200, 10, "M"));
        inventory.add(new Food(3, "Chicken Pizza", 250, 20, "30-03-2026", false));
        inventory.add(new Food(4, "Paneer Pizza", 150, 15, "28-03-2026", true));
        inventory.add(new Electronics(5, "Smartphone", 20000, 8, 1));
        inventory.add(new Electronics(6, "Headphones", 1500, 15, 1));
        inventory.add(new Clothing(7, "Jeans", 2000, 12, "L"));
        inventory.add(new Clothing(8, "Jacket", 3500, 6, "XL"));
        inventory.add(new Food(9, "Burger", 120, 25, "29-03-2026", false));
        inventory.add(new Food(10, "Milk", 60, 30, "28-03-2026", true));

        ShoppingCart cart = new ShoppingCart();
        ShoppingCart.CartOperations ops = cart.new CartOperations();

        int choice;

        do {
            System.out.println("\n1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (Product p : inventory) {
                        p.display();
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.print("Enter product id: ");
                    int id = sc.nextInt();

                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();

                    for (Product p : inventory) {
                        if (p.id == id) {
                            try {
                                ops.addItem(p, qty);
                                System.out.println("Added to cart!");
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                    break;

                case 3:
                    ops.viewCart();
                    break;

                case 4:
                    double total = ops.checkout();
                    System.out.println("Total amount: Rs." + total);
                    break;
            }

        } while (choice != 5);

        sc.close();
    }
}
