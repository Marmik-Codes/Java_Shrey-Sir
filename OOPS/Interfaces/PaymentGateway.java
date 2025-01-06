interface Payment{
    void ProcessPayment(double amount);
    void RefundPayment(double amount);
}
class PayPalGateway implements Payment{
    @Override
    public void ProcessPayment(double amount){
        System.out.println("Processing PayPal payment of $" + amount);
    }
    public void RefundPayment (double amount){
            System.out.println("Refunding PayPal payment of $" + amount);
    }
}
 class StripeGateway implements Payment {
    @Override
    public void ProcessPayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
    }

    @Override
    public void RefundPayment(double amount) {
        System.out.println("Refunding Stripe payment of $" + amount);
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PayPalGateway paypal = new PayPalGateway();
        paypal.ProcessPayment(2000);
        paypal.RefundPayment(500);

        StripeGateway stripe = new StripeGateway();
        stripe.ProcessPayment(5000);
        stripe.RefundPayment(3500);
    }
}
