
// Unit					Charge/unit
// upto 199				@1.20
// 200 and above but less than 400		@1.50
// 400 and above but less than 600		@1.80
// 600 and above				@2.00
// If bill exceeds Rs. 400 then a surcharge of 15% will be charged and the minimum bill should be of Rs. 100/-

// Test Data :
// 1001
// James
// 800
// Expected Output :
// Customer IDNO :1001
// Customer Name :James
// unit Consumed :800
// Amount Charges @Rs. 2.00 per unit : 1600.00
// Surchage Amount : 240.00
// Net Amount Paid By the Customer : 1840.00


import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Id: ");
        double Id = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter unit consumed: ");
        float unit = sc.nextFloat();

        float charge;

        if (unit <= 199 ) {
            charge = (float)1.20;    
        }else  if (unit >= 200 && unit < 400 ) {
            charge = (float) 1.50;
        }else if (unit >= 400 && unit < 600 ) {
            charge = (float)1.80;
        }else{
            charge = (float)2.00;
        }
        float bill  = charge*unit;

        float surcharge = 0;

        if(bill > 400){
            surcharge = bill * 0.15f;
        }
        float net_bill = bill + surcharge;

        System.out.println("Customer IDNO: " + Id);
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + unit);
        System.out.printf("Amount charges Rs.%.2f per unit: Rs.%.2f%n", charge,bill);
        System.out.printf("Surcharge Amount  Rs.%.2f%n", surcharge);
        System.out.println("Net Amount to be paid by customer Rs."+ net_bill);
        
        sc.close();
    }
}
