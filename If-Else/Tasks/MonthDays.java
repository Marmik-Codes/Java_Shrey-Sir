import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        int days;

        if (month == 1) {
            days = 31;  // January
        } else if (month == 2) {
            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;  // February in a leap year
            } else {
                days = 28;  // February in a non-leap year
            }
        } else if (month == 3) {
            days = 31;  // March
        } else if (month == 4) {
            days = 30;  // April
        } else if (month == 5) {
            days = 31;  // May
        } else if (month == 6) {
            days = 30;  // June
        } else if (month == 7) {
            days = 31;  // July
        } else if (month == 8) {
            days = 31;  // August
        } else if (month == 9) {
            days = 30;  // September
        } else if (month == 10) {
            days = 31;  // October
        } else if (month == 11) {
            days = 30;  // November
        } else if (month == 12) {
            days = 31;  // December
        } else {
            System.out.println("Invalid input! Please enter a month number between 1 and 12.");
            sc.close();
            return;
        }

        System.out.println("The number of days in month " + month + " is: " + days);
        sc.close();
    }
}
