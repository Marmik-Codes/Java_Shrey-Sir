import java.util.Scanner;

public class Roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
       
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
       
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();

        double descriminant = b*b - 4*a*c; 

        int result = 0;

        if (descriminant  > 0) {
            result = 1;
        }else if (descriminant == 0) {
            result = 2;
        }else{
            result = 3;
        }
        switch (result) {
            case 1:
                double root1 = (-b + Math.sqrt(descriminant)) / (2*a);
                double root2 = (-b - Math.sqrt(descriminant)) / (2*a);
                System.out.println("Roots are real and distinct.");
                System.out.println("Root 1: " + root1);
                System.out.println("Root 2: " + root2);
                break;
            case 2: 
                double root = -b  / (2*a);
                System.out.println("Roots are repeated and real");
                System.out.println("Root: " + root);
            
            case 3:
                System.out.println("Roots are imaginary ");
                break;
        }
        sc.close();
    }
}
