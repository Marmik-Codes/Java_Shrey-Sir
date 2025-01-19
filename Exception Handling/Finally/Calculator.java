// 1. Calculator with User Input: Develop a basic calculator that takes user input for arithmetic operations. Use 'try' and 'catch' to handle 'InputMismatchException' when incorrect input is provided and ensure scanner resources are closed in 'finally'.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();


        try {
            int add = a+b;
            int sub = a-b;
            int mul = a*b;
            int div = a/b;

            System.out.println(add);
            System.out.println(sub);
            System.out.println(mul);
            System.out.println(div);

        } catch (InputMismatchException e) {
            e.getStackTrace();
        }
        finally{
            sc.close();
        }
    }
}
