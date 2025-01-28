import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String s = sc.next();

        System.out.println(s.length());
        System.out.println(s.replace("M", "n"));
        // String str = "Samosa";
        // System.out.println(str.length());
        // System.out.println(str.toUpperCase());

        sc.close();
    }
}
