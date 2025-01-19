import java.util.Scanner;

public class Cel_Fah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Temperature Converter");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.print("Choose an option (1 or 2): ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter temperature in celcius: ");
                double cel = sc.nextDouble();
                double fah = (cel * 9/5) + 32;
                System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", cel, fah);
            }else if (choice == 2) {
                System.out.print("Enter temperature in fahrenheit: ");
                double fah = sc.nextDouble();
                double cel = (fah - 32) * 5/9;
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", fah, cel);
            }else{
                System.out.println("Invalid choice. Please choose either 1 or 2.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter numeric values only.");

        }finally{
            System.out.println("Cleaning up resources...");
            sc.close();
        }
    }
}
