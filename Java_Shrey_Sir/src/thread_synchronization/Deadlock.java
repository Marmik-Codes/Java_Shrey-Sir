package thread_synchronization;

public class Deadlock {
/*
    public static void main(String[] args) {
        final String resource1 = "Cad_bury";
        final String resource2 = "Five_Star";

        Thread t1 = new Thread("Marmik"){
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println(currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                synchronized (resource2){
                    System.out.println(currentThread().getName() + " got " + resource2);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        Thread t2 = new Thread("Falgun"){
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println(currentThread().getName() + " got " + resource2);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                synchronized (resource1){
                    System.out.println(currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
*/


    public static void main(String[] args) {
        final String resource1 = "Cad_bury";
        final String resource2 = "Five_Star";

        Thread t1 = new Thread("Marmik"){
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println(currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                synchronized (resource2){
                    System.out.println(currentThread().getName() + " got " + resource2);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        Thread t2 = new Thread("Falgun"){
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println(currentThread().getName() + " got " + resource1);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                synchronized (resource2){
                    System.out.println(currentThread().getName() + " got " + resource2);
                    try {
                        Thread.sleep(100);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
            }
        };

        t2.start();
        t1.start();


    }
}
