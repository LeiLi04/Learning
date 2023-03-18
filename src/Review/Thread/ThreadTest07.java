package Review.Thread;

public class ThreadTest07 {
    public static void main(String[] args) {
        //创建线程对象
        Thread t=new MyThread3();
        t.setName("t");
        t.start();

        //调用sleep方法
        try {
            //这串代码是静态代码，在哪里就让哪里的线程进入睡眠
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HelloKitty");
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()+"-------------->"+i) ;
        }
    }
}