package in.ac.adit.pwj.miniproject.shopping;

public class Product {
    protected int id;
    protected String name;
    protected double price;
    protected int stock;

    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void display() {
        System.out.println(id + ". " + name + " - Rs." + price + " (Stock: " + stock + ")");

    }
}
