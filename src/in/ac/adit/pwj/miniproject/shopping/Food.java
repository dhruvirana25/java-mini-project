package in.ac.adit.pwj.miniproject.shopping;

public class Food extends Product {
    private String expiryDate;
    private boolean isVeg;

    public Food(int id, String name, double price, int stock, String expiryDate, boolean isVeg) {
        super(id, name, price, stock);
        this.expiryDate = expiryDate;
        this.isVeg = isVeg;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Expiry: " + expiryDate + " | Veg: " + isVeg);
    }
}
