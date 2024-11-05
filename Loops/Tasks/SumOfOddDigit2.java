import java.util.Scanner;

public class SumOfOddDigit2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        int sum = 0;
        int a = 0;
        while (num > 0) {
            a = num % 10;
            if (a % 2 != 0) {
                sum += a;
            }
            num/=10;
        }
        System.out.println(sum);

        sc.close();
    }
}
