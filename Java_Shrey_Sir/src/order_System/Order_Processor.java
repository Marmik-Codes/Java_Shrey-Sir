package order_System;

import java.security.PublicKey;

class Order{
    private final double order_id ;
    private String name;
    private double price;

    Order(double order_id ,String name,double price){
            this.order_id = order_id;
            this.name = name;
            this.price = price;
    }
    public double getOrderid(){
        return order_id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return "Order [orderId=" + order_id + ", product=" + name + ", Price=" + price + "]";
    }
}

interface  OrderProcessor{
    void placeOrder(Order order);
    void cancelOrder(double order_id);
}

class CreditCard implements  OrderProcessor{
    @Override
    public void placeOrder(Order order) {
        System.out.println("Placing order using Credit Card: " + order);
    }
    @Override
    public void cancelOrder(double order_id) {
        System.out.println("Cancelling Credit Card order with ID: " + order_id);
    }
}
class PayPal implements OrderProcessor{
    @Override
    public void placeOrder(Order order) {
        System.out.println("Placing order using PayPal: " + order);
    }

    @Override
    public void cancelOrder(double order_id) {
        System.out.println("Canceling order using paypal: " + order_id);
    }
}

public class Order_Processor {
    public static void main(String[] args) {
        Order o1 = new Order(123,"S25 Ultra",129000);
        Order o2 = new Order(124,"Lenovo i7 Ultra",159000);

//        OrderProcessor Op1 = new O

        OrderProcessor cp = new CreditCard();
        cp.placeOrder(o1);
        cp.cancelOrder(o1.getOrderid());

        OrderProcessor pp = new PayPal();
        pp.placeOrder(o2);
        pp.cancelOrder(o2.getOrderid());
    }
}
