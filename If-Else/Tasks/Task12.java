import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the Roll number of student: ");
        double roll_no = sc.nextInt();

        sc.nextLine();
        System.out.print("Input the Name of the Student: ");
        String name = sc.nextLine();

        System.out.print("Input the marks of Physics, Chemistry and Computer Application :");
        int Physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Computer = sc.nextInt();

        int total = Physics + Chemistry + Computer;
        double percetage = (total/3);

        String division;
        if (percetage >= 60) {
            division = "First";
        }else if (percetage >= 50) {
            division = "Second";
        }else if (percetage >= 40) {
            division = "Third";
        }else {
            division = "Fail";
        }

        System.out.println("Roll no.: " + roll_no);
        System.out.println("Name of Student: " + name);
        System.out.println("Marks of Physics: " + Physics);
        System.out.println("Marks of Chemistry: " + Chemistry);
        System.out.println("Marks of Computer Applications: " + Computer);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percetage);
        System.out.println("Division: " + division);

        sc.close();
    }
}
