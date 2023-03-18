package Review.Thread;

public class TreadTest13 {
    public static void main(String[] args) {
        System.out.println("main begin");
        Thread thread=new Thread(new MyRunnable07());
        thread.setName("t");
        thread.start();
        //t.join() 合并线程，t合并到当前线程中，当前线程收到阻塞，t线程执行直到结束//通俗一点来讲，就是你先插队到我前面来
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over");
    }
}
class MyRunnable07 implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"------------->"+i);
        }
    }
}