import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();
        int days = 0;

        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;
            case 2:  // February
                System.out.print("Is it a leap year? (yes/no): ");
                String leapYear = sc.next().toLowerCase();
                if (leapYear.equals("yes")) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                System.out.println("Invalid month number! Please enter a number between 1 and 12.");
                sc.close();
                return; // Exit if the input is invalid
        }

        if (days > 0) {
            System.out.println("The number of days in month " + month + " is: " + days);
        }

        sc.close();
    }
}
