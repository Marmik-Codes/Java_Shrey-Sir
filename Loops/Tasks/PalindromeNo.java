import java.util.Scanner;

public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num: ");
        int num = sc.nextInt();

        int rev = 0;
        int temp = num;
        while (num > 0) {
            rev *= 10;
            rev = rev +(num%10);
            num/=10; 
        }
        
        if (temp == rev) {
            System.out.printf("%d is palindrome number",temp);
        }else{
            System.out.printf("%d is not palindrome number",temp);
        }

        sc.close();
    }
}
