package Review.Thread;

public class ThreadTest11 {
    public static void main(String[] args) {
        Thread t=new Thread(new MyRunnable06());
        t.setName("t");
        t.start();
        for(int i=0;i<10000;i++){
            System.out.println(Thread.currentThread().getName()+"------------->"+i);
        }
    }
}
class MyRunnable06 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10000;i++){
            //每100个让位1次
            if(i%100==0){
                Thread.yield();//当前线程暂停一下，让给主线程
            }
            System.out.println(Thread.currentThread().getName()+"-------------->"+i);
        }
    }
}