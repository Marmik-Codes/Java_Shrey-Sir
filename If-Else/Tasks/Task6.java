import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Height(in cm): ");
        int height = sc.nextInt();

        if (height < 135 ) {
            System.out.println("Person is dwarf");
        }
        else if (height > 135 && height < 150) {
            System.out.println("Person's height is medium");
        }
        else{
            System.out.println("Person is too tall");
        }
        sc.close();
    }    
}
