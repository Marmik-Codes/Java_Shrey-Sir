import java.util.Scanner;

public class AlphaCheck {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        System.out.println("Enter character: ");
        char ch = sc.nextLine().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is Vowel");
        }else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Consonant");
        }else{
            System.out.println("Pls enter valid charcater");
        }
        sc.close();
    }
}
