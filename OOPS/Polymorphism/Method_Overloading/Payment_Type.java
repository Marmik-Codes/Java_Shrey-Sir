

class Payment_Processor{
    
    // Via Credit or Debit
    public void processPayment(String CardNum, String Card_Holder_name,double amount){
        System.out.println("Payment Proccessed Through Credit card...");
        System.out.println("Card Number: " + CardNum);
        System.out.println("Card Holder Name: " + Card_Holder_name);
        System.out.println("Amount to proccesed: " + amount);
        System.out.println("Payment processed successfully via Credit Card.\n");
    }

    // Method to process payment via bank transfer
    public void processPayment(String acc_num, String bank_name,String acc_Hol_name , String IFSC_CODE , double amount){
        System.out.println("Payment Proccessed by Direct Transfer...");
        System.out.println("Account Number: " + acc_num);
        System.out.println("Bank Name: " + bank_name);
        System.out.println("Account Holder Name: " + acc_Hol_name);
        System.out.println("IFSC Code: " + IFSC_CODE);
        System.out.println("Amount: " + amount);
        System.out.println("Payment processed successfully via Bank Transfer.\n");
    }
    // Method to process payment via cash
    public void processPayment(double amount) {
        System.out.println("Processing cash payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("Payment processed successfully via Cash.\n");
    }
}

public class Payment_Type {
    public static void main(String[] args) {
        Payment_Processor p1 = new Payment_Processor();

        p1.processPayment("4236-3369-4754", "Marmik", 15000);
        p1.processPayment("254579894219","Infocity","Himesh", "4A568OH", 156862);
        p1.processPayment(250000);
    }    
}
