import java.util.Scanner;

public class DigitToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit (0-9): ");
        int digit = sc.nextInt();

        String word;

        if (digit == 0) {
            word = "Zero";
        } else if (digit == 1) {
            word = "One";
        } else if (digit == 2) {
            word = "Two";
        } else if (digit == 3) {
            word = "Three";
        } else if (digit == 4) {
            word = "Four";
        } else if (digit == 5) {
            word = "Five";
        } else if (digit == 6) {
            word = "Six";
        } else if (digit == 7) {
            word = "Seven";
        } else if (digit == 8) {
            word = "Eight";
        } else if (digit == 9) {
            word = "Nine";
        } else {
            System.out.println("Invalid input! Please enter a digit between 0 and 9.");
            sc.close();
            return;
        }

        System.out.println("The digit is: " + word);
        sc.close();
    }
}
