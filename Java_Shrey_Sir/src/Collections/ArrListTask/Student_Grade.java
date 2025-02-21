package Collections.ArrListTask;

import java.util.ArrayList;
import java.util.Scanner;

class Grade {
    ArrayList<Integer> grade = new ArrayList<>();

    void add_grade(int gr) {
        if (gr >= 0 ||  gr <= 100){
            grade.add(gr);
        }
        System.out.println("Grade added Successfully");

    }

    void remove_grade(int index) {
        display_grade();
        if (index >= 0 && index <= 100) {
            grade.remove(index);
        }
        System.out.println("Grade removed Successfully");

    }

    void display_grade() {
        System.out.println("Displaying Students Grades.!");
        for (Integer integer : grade) {
            System.out.println("Grades =>" + "[" + integer + "]");
        }
    }

    double average_grade() {
        int sum = 0;
        for (int grades : grade) {
            sum += grades;
        }

        return (double) sum / grade.size();
    }

}

public class Student_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade g1 = new Grade();
        int choice =0;
        do {
            System.out.println("Welcome to the Student Grade Management System!");
            System.out.println("1. Add a grade");
            System.out.println("2. Remove a grade");
            System.out.println("3. View all grade");
            System.out.println("4. Calculate Average");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter grade: ");
                    int gr = sc.nextInt();
                    g1.add_grade(gr);
                break;

                case 2:
                    g1.display_grade();
                    try {
                        System.out.println("Enter the index you want remove: ");
                        int rm = sc.nextInt();
                        g1.remove_grade(rm);
                    }catch (ArrayIndexOutOfBoundsException e){
                        System.out.println(e.getMessage());
                    }

                  break;

                case 3:
                    System.out.println("Viewing grades: ");
                    g1.display_grade();
                    break;
                case  4:
                    System.out.println("Average of grades: " + g1.average_grade());
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                   break;
                default:System.out.println("Invalid choice.Please try agian");

            }

        }while (choice != 5);
        sc.close();
    }
}
