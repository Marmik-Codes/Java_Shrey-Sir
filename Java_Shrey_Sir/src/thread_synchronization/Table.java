package thread_synchronization;

public class Table {
/*
   synchronized void printTable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
     void printTable(int n){
         synchronized (this) {
             for (int i = 1; i <= 10; i++) {
                 System.out.println(n + " * " + i + " = " + n * i);
                 try {
                     Thread.sleep(100);

                 } catch (InterruptedException e) {
                     System.out.println(e.getMessage());
                 }
             }
         }
    }
*/

    synchronized  static void printTable(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n*i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
