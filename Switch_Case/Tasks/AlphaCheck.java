import java.util.Scanner;

public class AlphaCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel");
                break;

            default:
                if (ch >= 'a' && ch <= 'z') {
                    System.out.println(ch + " is a consonant");
                }else{
                    System.out.println("Invalid input! Please enter an alphabet letter.");
                }
                break;
        }
        sc.close();
    } 
}
