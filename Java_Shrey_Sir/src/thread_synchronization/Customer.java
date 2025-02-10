package thread_synchronization;

public class Customer {
    int amount = 10000;
     synchronized void  withdraw(int amount){
         System.out.println(Thread.currentThread().getName() + " is going to withdraw...!");

         if (this.amount < amount){
             System.out.println(Thread.currentThread().getName() + ": Less balance waiting for deposit...!");
             try {
                 wait();
             }catch (Exception e){
                 System.out.println(e.getMessage());
             }
         }
         this.amount =- amount;
         System.out.println(Thread.currentThread().getName() + ": withdraw completed...");
         notify();
     }
     synchronized void deposit(int amount){
         System.out.println(Thread.currentThread().getName() + " is going to deposit..!");
         this.amount += amount;
         System.out.println(Thread.currentThread().getName() + ": deposit completed..!");
         notify();
     }
}
