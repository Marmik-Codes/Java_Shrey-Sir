import java.util.Scanner;

public class Starbucks {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hey... Welcome to Starbucks Coffee.");

                System.out.println("Here are the Menu.");

                System.out.println("1.Coffee");
                System.out.println("2.Tea");
                System.out.println("3.Milk");
                System.out.println("4.Juice");
                System.out.println("5.Water");
                System.out.println("6.Soda");
                System.out.println("7.Exit ");
                System.out.print("Enter Your option from above: ");
                int choice = sc.nextInt();
                do {

                        switch (choice) {
                                case 1:
                                        System.out.println("1.Cappuccino");
                                        System.out.println("2.Latte");
                                        System.out.println("3.Espresso");
                                        System.out.println("4.Americano");
                                        System.out.println("5.Mocha");
                                        System.out.print("You Selected Coffee. Now select type from above: ");
                                        int ch1 = sc.nextInt();
                                        switch (ch1) {
                                                case 1:
                                                        System.out.println("Select Cup Size: ");
                                                        System.out.println("1. Small");
                                                        System.out.println("2. Medium");
                                                        System.out.println("3. Large");
                                                        int ch2 = sc.nextInt();
                                                        switch (ch2) {
                                                                case 1:
                                                                        System.out.println(
                                                                                        "Your order is confirmed for Small cup Cappuccino");
                                                                        break;
                                                                case 2:
                                                                        System.out.println(
                                                                                        "Your order is confirmed for Medium cup Cappuccino");
                                                                        break;
                                                                case 3:
                                                                        System.out.println(
                                                                                        "Your order is confirmed for large cup Cappuccino");
                                                                        break;

                                                                default:
                                                                        System.out.println("Pls Select proper Size.");
                                                                        break;
                                                        }
                                                        break;
                                                case 2:
                                                        System.out.println("Select Cup Size: ");
                                                        System.out.println("1. Small");
                                                        System.out.println("2. Medium");
                                                        System.out.println("3. Large");
                                                        int ch3 = sc.nextInt();
                                                switch (ch3) {
                                                        case 1:
                                                                System.out.println(
                                                                                "Your order is confirmed for Small cup Latte");
                                                                break;
                                                        case 2:
                                                                System.out.println(
                                                                                "Your order is confirmed for Medium cup Latte");
                                                                break;
                                                        case 3:
                                                                System.out.println(
                                                                                "Your order is confirmed for large cup Latte");
                                                                break;

                                                        default:
                                                                System.out.println("Pls Select proper Size.");
                                                                break;
                                                }
                                                case 3:
                                                        System.out.println("Select Cup Size: ");
                                                        System.out.println("1. Small");
                                                        System.out.println("2. Medium");
                                                        System.out.println("3. Large");
                                                        int ch4 = sc.nextInt();
                                                switch (ch4) {
                                                        case 1:
                                                                System.out.println(
                                                                                "Your order is confirmed for Small cup Espresso");
                                                                break;
                                                        case 2:
                                                                System.out.println(
                                                                                "Your order is confirmed for Medium cup Espresso");
                                                                break;
                                                        case 3:
                                                                System.out.println(
                                                                                "Your order is confirmed for large cup Espresso");
                                                                break;
                                                        default:
                                                                System.out.println("Pls Select proper Size.");
                                                                break;
                                                }
                                                case 4:
                                                System.out.println("Select Cup Size: ");
                                                System.out.println("1. Small");
                                                System.out.println("2. Medium");
                                                System.out.println("3. Large");
                                                int ch5 = sc.nextInt();
                                                switch (ch5) {
                                                        case 1:
                                                                System.out.println(
                                                                                "Your order is confirmed for Small cup Americano");
                                                                break;
                                                        case 2:
                                                                System.out.println(
                                                                                "Your order is confirmed for Medium cup Americano");
                                                                break;
                                                        case 3:
                                                                System.out.println(
                                                                                "Your order is confirmed for large cup Americano");
                                                                break;

                                                        default:
                                                                System.out.println("Pls Select proper Size.");
                                                                break;
                                                }
                                                case 5:
                                                        System.out.println("Select Cup Size: ");
                                                        System.out.println("1. Small");
                                                        System.out.println("2. Medium");
                                                        System.out.println("3. Large");
                                                        int ch6 = sc.nextInt();
                                                switch (ch6) {
                                                        case 1:
                                                                System.out.println(
                                                                                "Your order is confirmed for Small cup Mocha");
                                                                break;
                                                                case 2:
                                                                System.out.println(
                                                                                "Your order is confirmed for Medium cup Mocha");
                                                                break;
                                                        case 3:
                                                                System.out.println(
                                                                                "Your order is confirmed for large cup Mocha");
                                                                break;
                                                        default:
                                                                System.out.println("Pls Select proper Size.");
                                                                break;
                                                }

                                                default:System.out.println("Please select proper type");
                                                        break;
                                        }

                                        break;

                                default:
                                        break;
                        }
                } while (choice == 7);

                sc.close();
        }
}
// Cappuccino
// - Latte
// - Espresso
// - Americano
// - Mocha
