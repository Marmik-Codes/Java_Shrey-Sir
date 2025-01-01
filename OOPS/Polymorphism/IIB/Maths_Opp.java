// 2. Math Operations: Develop a class that performs mathematical operations (addition, subtraction, etc.). Initialize required constants and variables within an instance initializer block.

class Math{
    int a;
    int b;

    {
        a = 10;
        b = 10;
        System.out.println("Instance initializer block executed. Variables initialized.");
    }
    Math(int a , int b){
        this.a = a;
        this.b = b;
        System.out.println("Constructor executed. Values set to: a = " + a + ", b = " + b);
    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    double div(){
        if (b != 0) {
            return (double) a/b;
        }else {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
    }
}

public class Maths_Opp {
    public static void main(String[] args) {
        Math constant = new Math(10, 5);
        System.out.println("Addition: " + constant.add());
        System.out.println("Subtraction: " + constant.sub());
        System.out.println("Multiplication: " + constant.mul());
        System.out.println("Division: " + constant.div());
        
        Math custom = new Math(20, 20);
        System.out.println("Addition: " + custom.add());
        System.out.println("Subtraction: " + custom.sub());
        System.out.println("Multiplication: " + custom.mul());
        System.out.println("Division: " + custom.div());
    }

}
