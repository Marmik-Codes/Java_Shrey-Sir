import java.util.Scanner;

public class ProfitLossCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cost Price: ");
        float cost = sc.nextFloat();

        System.out.println("Enter Selling Price: ");
        float sell = sc.nextFloat();

        float diff = sell - cost;

        if (cost < sell) {
            System.out.println("You can booked your profit amount :" + diff);
        
        }else if (cost == sell) {
            System.out.println("You can't  booked your profit amount :" + diff);
        }
        else
        {
            System.out.println("You're in loss :" + diff);
        }
        sc.close();
    }
}
