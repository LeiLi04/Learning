package Review.Thread.deadlock;

public class DeadLock {
    public static void main(String[] args) {
        Object object01 = new Object();
        Object object02 = new Object();
        MyThread01 myThread01 = new MyThread01(object01, object02);
        MyThread02 myThread02 = new MyThread02(object01, object02);
        myThread01.start();
        myThread02.start();
    }
}
class MyThread01 extends Thread{
    //2个object对象
    Object object01=new Object();
    Object object02=new Object();
    //constructor

    public MyThread01(Object object01, Object object02) {
        this.object01 = object01;
        this.object02 = object02;
    }

    @Override
    public void run() {
        synchronized (object01){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object02){}
        }
    }
}
class MyThread02 extends Thread{
    //2个object对象
    Object object01=new Object();
    Object object02=new Object();
    //constructor

    public MyThread02(Object object01, Object object02) {
        this.object01 = object01;
        this.object02 = object02;
    }

    @Override
    public void run() {
        synchronized (object02){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object01){}
        }
    }
}