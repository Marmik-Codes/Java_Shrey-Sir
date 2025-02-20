package Collections.ArrListTask;

import java.util.ArrayList;
import java.util.Scanner;

class MenuItem{
    private String name ;
    private double price;

    public MenuItem(String name , double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return name + " - ₹" + price;
    }
}
class  RestaurantMenu{
    ArrayList<MenuItem> menuItems;

    public RestaurantMenu(){
        menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Pav-Bhaji", 150));
        menuItems.add(new MenuItem("Vada Pav", 40));
        menuItems.add(new MenuItem("Panner Bhurji", 350));
        menuItems.add(new MenuItem("Dabeli", 30));
        menuItems.add(new MenuItem("Frankie", 90));
    }
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void displayMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i));
        }
    }
}
class Order{
    ArrayList<MenuItem> orderItems;

    public Order() {
        orderItems = new ArrayList<>();
    }
    public void addItem(MenuItem item) {
        orderItems.add(item);
        System.out.println(item.getName() + " added to your order.");
    }
    public  void viewOrder(){
        if (orderItems.isEmpty()){
            System.out.println("Your order is empty.");
            return;
        }
        System.out.println("Your Order...");
        for (MenuItem item: orderItems){
            System.out.println(item);
        }
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
    public  double calculateTotalCost(){
        double totalcost = 0;
        for(MenuItem item : orderItems){
            totalcost += item.getPrice();
        }
        return  totalcost;

    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RestaurantMenu menu = new RestaurantMenu();
        Order newOrder = new Order();
        int choice;

        do {
            System.out.println("\nWelcome to the Restaurant Management System");
            System.out.println("1. Display Menu");
            System.out.println("2. Add Item to Order");
            System.out.println("3. View Order");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1: menu.displayMenu();
                break;
                case 2:
                    menu.displayMenu();
                    System.out.print("Enter the number of the item you want to add: ");
                    int itemNum = sc.nextInt();

                    if (itemNum >=1 &&  itemNum <= menu.getMenuItems().size()){
                        newOrder.addItem(menu.getMenuItems().get(itemNum-1));
                    }else {
                        System.out.println("Invalid item number. Pls try again.");
                    }break;
                case  3:
                    newOrder.viewOrder();
                    break;
                case 4:
                    System.out.println("Thank u for visiting our restaurant! Goodbye!");
                default:
                    System.out.println("Invalid choice.Please try agian");
            }
        }while (choice != 4);
        sc.close();
    }
}
