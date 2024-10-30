import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X: ");
        int x = sc.nextInt();
        System.out.print("Enter Y: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0 ) {
            System.out.println("The Coordinate  (" + x +","+ y + ")  lies in 1st Quadrant" );
        }
        else if (x < 0 && y >0) {
            System.out.println("The Coordinate  (" + x +","+ y + ")  lies in 2nd Quadrant" );
        }
        else if (x < 0 && y < 0) {
            System.out.println("The Coordinate  (" + x +","+ y + ")  lies in 3rd Quadrant" );

        }else System.out.println("The Coordinate  (" + x +","+ y + ")  lies in 4th Quadrant" );

        sc.close();
    }
}
