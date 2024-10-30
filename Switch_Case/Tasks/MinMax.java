import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int result = (num1 > num2) ? 1 : (num1 < num2) ? 2:3;

        switch (result) {
            case 1:
            System.out.println("The maximum number is: " + num1);
            break;
            
            case 2:
            System.out.println("The maximum number is: " + num2);
            break;
            
            case 3:
            System.out.printf("%d and %d are equal",num1,num2);
            break;
            
            
        }
        sc.close();
    }
}
