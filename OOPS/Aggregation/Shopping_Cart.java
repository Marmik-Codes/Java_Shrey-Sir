class Item{
    private String name;
    private double price;
    private int quantity;

    public Item(String name,double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getPrice(){
        return price;

    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getTotalPrice(){
        return price*quantity;
    }

    // public 
    @Override
    public String toString(){
        return name + " - " + quantity + " @ $" + price + " each. Total: $" + getTotalPrice();
    }
}

class ShoppingCart{
    private Item[] items;
    private int itemcnt;

    public ShoppingCart(int capacity){
        items = new Item[capacity];
        itemcnt = 0;
    }

    public void addItem(Item item){
        if (itemcnt < items.length) {
            items[itemcnt] = item;
            itemcnt++;
        }else{
            System.out.println("The cart is Full. Cannnot add more items.");
        }
    }

    public void removeItem(String itemName){
        boolean Itemfound = false;
        for (int i = 0; i < itemcnt; i++) {
            if (items[i].getName() == itemName) {
                Itemfound = true;
                for(int j = i; j < itemcnt -1; j++){
                    items[j] = items[j+1];

                }
                items[itemcnt-1] = null;
                itemcnt--;
                break;
            }
        }
        if (!Itemfound) {
            System.out.println("Item not Found int the cart");
        }
    }

    public double calculateTotal(){
        double total = 0;
        for (int i = 0; i < itemcnt; i++) {
            total += items[i].getTotalPrice();
        }        
        return total;
    }

    public void displayCart(){

        if (itemcnt == 0) {
            System.out.println("The Shopping cart is Empty.");
        }
        else{
            System.out.println("Shopping Cart: ");
            for (int i = 0; i < itemcnt; i++) {
                System.out.println(items[i]);
            }
            System.out.println("Total: $" + calculateTotal());
        }
    }
}

public class Shopping_Cart {
    public static void main(String[] args) {
        ShoppingCart s1 = new ShoppingCart(2);

        // Item I1 = new Item("Laptop",56000,2);
        // Item I2 = new Item("TV",120000,1);
        // Item I3 = new Item("Phone",25000,4);

        s1.addItem(new Item("Laptop",56000,2));
        s1.addItem(new Item("TV",120000,1));
        s1.addItem(new Item("Phone",25000,4));

        s1.displayCart();

        s1.removeItem("Phone");
        s1.displayCart();

    }
}
