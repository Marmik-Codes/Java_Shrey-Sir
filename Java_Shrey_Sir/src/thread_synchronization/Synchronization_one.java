package thread_synchronization;

class MyThread3 extends  Thread{
    public void run(){
        Table.printTable(3);
    }
}

class MyThread4 extends  Thread{
    public void run(){
        Table.printTable(12);
    }
}
public class Synchronization_one {
    public static void main(String[] args) {
//        Table t = new Table();
//        MyThread1 t1 = new MyThread1(t,1);
//        MyThread2 t2 = new MyThread2(t);
//
//        t1.start();
//        t2.start();

        MyThread3 t3 = new MyThread3();
        MyThread4 t4 = new MyThread4();

        t3.start();
        t4.start();
    }
}
