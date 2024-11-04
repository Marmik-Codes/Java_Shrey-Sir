import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        int rem = 0;
        int arm = 0;
        int temp = num;

        while (num > 0) {
            rem = num% 10;
            arm = arm + (rem * rem * rem);
            num /= 10;    
        }

        if (temp == arm) {
            System.out.println("Enter Num is Armstrong");
        }else{
            System.out.println("Enter num is not an Armstrong");
        }
        sc.close();
    }
}
