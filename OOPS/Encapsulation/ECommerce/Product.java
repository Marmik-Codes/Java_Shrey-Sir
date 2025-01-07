package ECommerce;

public class Product {
    private int id;
    private String name;
    private double price;
    private int Stockquantity;


    public Product( int id, String name, double price, int stockquantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        Stockquantity = stockquantity;
    }
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getStockquantity() {
        return Stockquantity;
    }
    
    public void updateStock(int quantity) {
        if (Stockquantity + quantity < 0) {
            System.out.println("Insufficient stock for " + name);
        } else {
            Stockquantity += quantity;
            System.out.println("Stock updated! New stock for " + name + ": " + Stockquantity);
        }
    }
    
}
