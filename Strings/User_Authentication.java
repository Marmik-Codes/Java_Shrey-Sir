import java.util.Scanner;

public class User_Authentication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Set Password for your account: ");
        String  set_pwd = sc.nextLine();

        int password = set_pwd.hashCode();
         
        System.out.print("Enter password to login: ");
        String ent_pwd = sc.nextLine();

        if (ent_pwd.hashCode() == password) {
            System.out.println("Verification Completed.Enjoy!!...");
        }else{
            System.out.println("Verification failed. Check your password.");
        }

        sc.close();
    }
}
