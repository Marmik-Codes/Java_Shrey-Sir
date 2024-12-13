import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of an array: ");
        int size = sc.nextInt();

        int Arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();    
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < Arr.length; i++) {
            
            if (min > Arr[i]) {
                min = Arr[i];
            }
            if (max < Arr[i]) {
                max = Arr[i];
            }
        }
        System.out.printf("Largest Element: %d" , max);
        System.out.printf("\nSmallest Element: %d" , min);
    }    
}
