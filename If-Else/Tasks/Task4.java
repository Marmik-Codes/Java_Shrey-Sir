import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int age = sc.nextInt();
        
        if (age >= 18) {
            System.out.println("Congratulation! You are eligible for casting your vote.");
        }
        else{
            System.out.println("Uhh! You are not eligible for casting your vote.");
        }
        
        sc.close();
    }    
}
