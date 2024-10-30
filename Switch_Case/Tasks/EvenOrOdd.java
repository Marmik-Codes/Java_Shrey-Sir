import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int remainder = num % 2;

        switch (remainder) {
            case 0:
                System.out.println(num + " is an Even number.");
                break;
            case 1:
                System.out.println(num + " is an Odd number.");
                break;
            default:
                System.out.println("Invalid input!");  
        }

        sc.close();
    }
}
