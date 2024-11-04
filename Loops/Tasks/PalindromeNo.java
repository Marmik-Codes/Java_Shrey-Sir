import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num: ");
        int num = sc.nextInt();

        int rev = 0;
        int rem = 0;
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev*10+rem;
           num/=10; 
        }
        
        if (temp == num) {
            System.out.printf("%d is palindrome number",temp);
        }else{
            System.out.printf("%d is not palindrome number",temp);
        }

        sc.close();
    }
}
