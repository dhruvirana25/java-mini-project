package in.ac.adit.pwj.miniproject.shopping;

import java.io.*;
import java.util.*;

public class FileHandler {

    public static void generateReceipt(Map<Product, Integer> cartItems, double total) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("receipt.txt"));

            writer.write("----- SHOPPING RECEIPT -----\n");

            for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
                Product p = entry.getKey();
                int qty = entry.getValue();

                writer.write(p.name + " x " + qty + " = Rs." + (p.price * qty));
                writer.newLine();
            }

            writer.write("-----------------------------\n");
            writer.write("Total Amount: Rs." + total);

            writer.close();

            System.out.println("Receipt generated successfully!");

        } catch (IOException e) {
            System.out.println("Error writing receipt file");
        }
    }
}
