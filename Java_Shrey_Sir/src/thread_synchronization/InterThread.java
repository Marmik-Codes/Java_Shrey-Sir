package thread_synchronization;

public class InterThread {
    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread(){
            @Override
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
