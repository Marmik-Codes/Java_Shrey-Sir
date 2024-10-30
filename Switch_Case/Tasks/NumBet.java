import java.util.Scanner;

public class NumBet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                
                System.out.println("Between 1-5");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Between 6-10");
                break;
            
            default:
                System.out.println("Greater Than 10");
                break;
        }
        sc.close();
    }
}
