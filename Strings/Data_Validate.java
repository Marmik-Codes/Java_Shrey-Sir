import java.util.Scanner;


public class Data_Validate {
    public static boolean validate_email(String email){
        return email.contains("@") && email.contains(".") && email.indexOf('@') < email.lastIndexOf('.') && email.indexOf('@') > 0 && email.lastIndexOf('.') < email.length() - 1;
}
    public static String Clean(String email){
        return email.trim().toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Email: ");
        String s = sc.nextLine();

        String Clean = Clean(s);

        if (validate_email(Clean)) {
            System.out.println("Valid email address: " + validate_email(Clean));
        }else{
            System.out.println("InValid email address.Pls try agian. " );
        }
        
        sc.close();
    }
    
}