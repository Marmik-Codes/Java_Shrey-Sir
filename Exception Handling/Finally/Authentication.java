// 4. User Authentication: Create a basic login system. Implement 'try' and 'catch' to handle 'LoginFailedException' and ensure resource release (e.g., closing streams) in the 'finally' block.

import java.util.Scanner;

class LoginFailedException extends Exception {
    public LoginFailedException(String msg) {
        super(msg);
    }

}

public class Authentication {
    public static void main(String[] args) throws LoginFailedException {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Username: ");
            String usname = sc.nextLine();
            System.out.print("Enter password: ");
            String pwd = sc.nextLine();
            authenticate(usname, pwd);
            System.out.println("Login Successful! Welcome " + usname);

        }catch (LoginFailedException e){
            System.err.printf("Login failed.",e.getMessage());
        } finally {
            System.out.println("Resources Cleaned.");
            sc.close();
        }
    }

    public static void authenticate(String usname, String pwd) throws LoginFailedException {

        final String Username = "Admin";
        final String password = "Marmik1234";

        if (!Username.equals(usname) || !password.equals(pwd)) {
            throw new LoginFailedException("Login failed . Invalid credentials");
        }
    }
}