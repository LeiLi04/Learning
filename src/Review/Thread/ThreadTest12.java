package Review.Thread;

public class ThreadTest12 {
    public static void main(String[] args) {
        //设置主线程的优先级为1
        Thread.currentThread().setPriority(1);
        System.out.println("MaxPriority---------->"+Thread.MAX_PRIORITY);
        System.out.println("MinPriority---------->"+Thread.MIN_PRIORITY);
        System.out.println("NormalPriority---------->"+Thread.NORM_PRIORITY);

        //获取当前线程，获取当前线程的优先级
        Thread currentThread=Thread.currentThread();
        System.out.println(currentThread.getName()+"线程的优先级是"+currentThread.getPriority());
        MyRunnable05 runnable05=new MyRunnable05();
         Thread thread=new Thread(new MyRunnable05());
         thread.setName("t");
         //优先级高的，只是抢到的CPU时间片相对多一些
        //大概率方向更偏向于优先级比较高的
         thread.setPriority(10);
         thread.start();
         //优先级比较高的，只是抢到的CPU时间片多一些
        //主线程的for loop
        for(int i=0;i<100;i++){
            System.out.println("主线程-------->"+i);
        }
    }
}
class MyRunnable05 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"的线程优先级是"+Thread.currentThread().getPriority());
        for(int j=0;j<100;j++){
            System.out.println("branch thread---------->"+j);
        }
    }
}