import java.util.Scanner;



public class DayNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Day number: ");
        int day = sc.nextInt();

        sc.nextLine();
        String day_name = " ";

        if (day == 1) {
            day_name = "Sunday";           
        }else if (day == 2) {
            day_name = "Monday";
        }else if (day == 3){
            day_name = "Tuesday";
        }else if (day == 4) {
            day_name = "Wednesday";
        }else if (day == 5){
            day_name = "Thursday";
        }else if (day == 6){
            day_name = "Friday";
        }else if (day == 7){
            day_name = "Saturday";
        }else {
            System.out.println("Pls enter num [1-7]");
        }
        System.out.println("Day: " + day_name);

        sc.close();
    }
}
