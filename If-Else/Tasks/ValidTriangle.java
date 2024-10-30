import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter angle1: ");
        int angle1 = sc.nextInt();
        
        System.out.println("Enter angle2: ");
        int angle2 = sc.nextInt();
        
        System.out.println("Enter angle3: ");
        int angle3 = sc.nextInt();
        
        if ((angle1 + angle2 + angle3 == 180) && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The given angles form a valid triangle.");
        }else{
            System.out.println("The given angles do not form a valid triangle.");
        }
        sc.close();
    }
}
