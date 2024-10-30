import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean isLeapYear = false;
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = (year % 400 == 0);
            }
            else{
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year +  " is leap year");
        }
        else{
            System.out.println(year +  " is not leap year");
        }
        sc.close();
    }
}
// || a % 100 == 0  || a % 400 == 0