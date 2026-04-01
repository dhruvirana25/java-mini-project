package in.ac.adit.pwj.miniproject.shopping;

public class Clothing extends Product {
    private String size;

    public Clothing(int id, String name, double price, int stock, String size) {
        super(id, name, price, stock);
        this.size = size;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Size: " + size);
    }
}
