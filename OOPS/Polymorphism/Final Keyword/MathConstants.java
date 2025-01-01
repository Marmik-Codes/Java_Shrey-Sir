// In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.
import java.lang.Math;

public class MathConstants {
    int r;
    final static double pi = 3.14;   
    
    double radius(int radius){
        double ans = pi *(Math.pow(radius,2));
        return ans;
    }
    public static void main(String[] args) {
        MathConstants m1 = new MathConstants();
        System.out.println(m1.radius(2));
    }
}
