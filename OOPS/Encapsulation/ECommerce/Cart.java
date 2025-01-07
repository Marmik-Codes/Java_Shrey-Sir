package ECommerce;
import ECommerce.Product;


public class Cart {
    private Product[] items;
    private int[] quantities;
    private int itemcnt;
    private final int MAX_ITEMS = 5;
    
    public Cart() {
        this.items = new Product[MAX_ITEMS];
        this.quantities = new  int[MAX_ITEMS];
        this.itemcnt = 0;
    }

    public void addItem(Product product , int quantity){
        if (itemcnt >= MAX_ITEMS) {
            System.out.println("Cart is full! Cannot add more products.");
            return;
      
        }
        items[itemcnt] = product;
        quantities[itemcnt] = quantity;
        itemcnt++;
        System.out.println(quantity + " units of " +  product.getName() );
    }
    public void remove_Item(int id){
        boolean found = false;
        // int index = findProductIndex()
        for (int i = 0; i < itemcnt; i++) {
            if (items[i].getId() == id) {
                found = true;
                System.out.println("Product of Id " + items[i].getId() + " has Successfully removed.");
                for (int j = 0; j < itemcnt - 1; j++) {
                    items[j] = items[j+1];
                    quantities[i] = quantities[i+1];
                }
                items[itemcnt -1 ] = null;
               quantities[itemcnt - 1] = 0;
               itemcnt--;
               break;
            }
        }
        if (!found) {
            System.out.println("Product of ID " + id + " is not found.");
        }
        
    }
    public void displayCart(){
        if (itemcnt == 0) {
            System.out.println("Cart is Empty.");
            return;
        }
        System.out.println("\n Cart Contains:");
        for (int i = 0; i < itemcnt; i++) {
            System.out.println(items[i].getName() + " - Quantity: " + quantities[i]);
        }
    }
    public void clearCart(){
        itemcnt = 0;
        System.out.println("Cart has been cleared.");
    }
}
