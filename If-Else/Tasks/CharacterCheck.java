import java.util.Scanner;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >='A' && ch <= 'Z') || (ch >='a' && ch <='z')) {
            System.out.println(ch + " is Alphabet");
        } 
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit");
        }
        else {
            System.out.println(ch+ " is a special character");
        }
        sc.close();
    }
}
