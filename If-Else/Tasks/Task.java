import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        
        if (a == b) {
            System.out.println("Both are equal");
        }
        else {System.out.println("Both are not equal");}
        
        sc.close();
    }
    
}