class Fibonacci extends Thread{
    int n;
    
    
    Fibonacci(String name,int n){
        super(name);
        this.n = n;
    }
    
    int fibo(int n){
        if (n <= 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    
    @Override 
    public void run(){
      for (int i = 0; i < n; i++) {
        System.out.print("("+getName() + " , " +  fibo(i)+"), " );
      }  
    }
}
// class Fibonacci_Func extends Thread{
//     int n;
//     Fibonacci_Func(){
//         super();
//     }
//     Fibonacci_Func(String name,int n){
//         super(name);
//         this.n = n;
//     }
//     int fibo(int n){
//         if (n <= 0) {
//             System.out.println("Please provide a positive integer.");
            
//         }
//         int first = 0, second = 1;

//         // System.out.print("Fibonacci Series: ");
//         for (int i = 1; i <= n; i++) {
//             System.out.print(first + " ");
//             int sum = first + second;
//             first = second;
//             second = sum;
//         }
//     return second;
//     }
//     @Override 
//     public void run(){
//         System.out.println("(" + getName() + " ,  " + fibo(n) + ")");
//     }
// }

public class Fibonacci_Series {
  
        public static void main(String[] args) {
            Fibonacci f1 = new Fibonacci("t1",5);
            Fibonacci f2 = new Fibonacci("t2",5);
            Fibonacci f3 = new Fibonacci("t3",5);
            Fibonacci f4 = new Fibonacci("t4",5);
            Fibonacci f5 = new Fibonacci("t5",5);

            f1.start();
            f2.start();
            f3.start();
            f4.start();
            f5.start();
            // Fibonacci_Func f1 = new Fibonacci_Func("t1",5);
            // Fibonacci_Func f2 = new Fibonacci_Func("t2",5);
            // Fibonacci_Func f3 = new Fibonacci_Func("t3",5);
            // Fibonacci_Func f4 = new Fibonacci_Func("t4",5);
            // Fibonacci_Func f5 = new Fibonacci_Func("t5",5);

            // f1.start();
            // f2.start();
            // f3.start();
            // f4.start();
            // f5.start();
        }
}

