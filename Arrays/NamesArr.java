import java.util.Scanner;

public class NamesArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int size = sc.nextInt();

        String name[] = new String[size];

        for (int i = 0; i < size; i++) {
            
            name[i] = sc.next();
        }

        for (int i = 0; i < name.length; i++) {
            System.out.println("Name " + (i+1) + name[i]);
        }
    }    
}
