import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter base: ");
        int base = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();
        int ans = 1;

        for (int i = 0; i < power; i++) {
            ans = ans * base;
        }
        
        System.out.printf("Answer of %d to the power %d is: %d" , base,power,ans);
        sc.close();
    }
}
