package in.ac.adit.pwj.miniproject.shopping;

public class Electronics extends Product {
    private int warranty;

    public Electronics(int id, String name, double price, int stock, int warranty) {
        super(id, name, price, stock);
        this.warranty = warranty;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Warranty: " + warranty + " years");
    }
}
