import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num: ");
        int num = sc.nextInt();

        int result = 0;
        if (num > 0) {
            result = 0;
        }
        else if (num == 0) {
            result = 1;
        }
        else{
            result = -1;
        }
        switch (result) {
            case 0:
                System.out.println(num+ " is Positive Number");
                break;
            case 1:
                System.out.println(num+ " is Zero Number");
                break;
            case -1:
                System.out.println(num+ " is Negative Number");
                break;
        
            default:
                System.out.println("Pls enter valid number. Don't enter special character");
                break;
        }

        sc.close();
    }
}
