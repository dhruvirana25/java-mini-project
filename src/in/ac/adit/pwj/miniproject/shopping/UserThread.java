package in.ac.adit.pwj.miniproject.shopping;

public class UserThread extends Thread {

    private ShoppingCart cart;
    private Product product;

    public UserThread(ShoppingCart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    public void run() {
        ShoppingCart.CartOperations ops = cart.new CartOperations();

        try {
            ops.addItem(product, 1);
            System.out.println(Thread.currentThread().getName() + " added " + product.name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
