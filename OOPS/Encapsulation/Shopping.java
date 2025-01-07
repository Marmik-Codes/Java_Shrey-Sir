import ECommerce.Product;
import ECommerce.Cart;

public class Shopping {
    public static void main(String[] args) {
        Product p1 = new Product(234, "Sugar", 45, 5);
        Product p2 = new Product(235, "Rice", 50, 5);

        Cart c1 = new Cart();
        c1.addItem(p1, 2);
        c1.addItem(p2, 3);

        c1.displayCart();
        c1.remove_Item(23);
        c1.displayCart();

        // c1.clearCart();
        // c1.displayCart();
    }
}
