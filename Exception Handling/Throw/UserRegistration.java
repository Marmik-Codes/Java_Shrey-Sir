import java.util.Scanner;
import java.util.regex.Pattern;

class ValidException extends Exception{
    public ValidException(String msg){
        super(msg);
    }
}

class UserRegistrationSystem {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    private static final String PWD_REGEX = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

    public void Register_User(String Username , String Email , String Password) throws ValidException{
        if (Username == null || Username.trim().isEmpty()) {
            throw new ValidException("Username cannot be empty.");
        }
        if (Email == null || !Pattern.matches(EMAIL_REGEX, Email)) {
            throw new ValidException("Invalid email format.");
        }
        if (Password == null || !Pattern.matches(PWD_REGEX, Password)) {
            throw new ValidException("Password doesn't matches the requirement.");
        }
        System.out.println("User registered successfully!");
    }
    
}

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UserRegistrationSystem register = new UserRegistrationSystem();
        try {
            System.out.println("Enter Username: ");
            String usname = sc.nextLine();
            
            System.out.println("Enter Email: ");
            String email = sc.nextLine();
            
            System.out.println("Enter Password: ");
            String password = sc.nextLine();

            register.Register_User(usname, email, password);


        } catch (ValidException e) {
            System.out.println("Registration failed: " + e.getMessage());
        }
        finally{
            sc.close();
        }
        
    }
}
