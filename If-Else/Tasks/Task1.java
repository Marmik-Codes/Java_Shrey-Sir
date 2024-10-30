import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        
        
        
        if (a % 2== 0) {
            System.out.println("Enter num is even");
        }
        else{
            System.out.println("Enter num is odd");
        }
        sc.close();
    }    

}
