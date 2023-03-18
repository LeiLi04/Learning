package Review.Thread;

public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable04 myRunnable04=new MyRunnable04();
        Thread t=new Thread(myRunnable04);
        t.setName("t");
        t.start();
        //模拟5s
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //终止线程
        myRunnable04.run=false;
    }
}
class MyRunnable04 implements Runnable{
    //打一个boolean标记
    boolean run=true;

    @Override
    public void run() {
        //这里的run就像是一个开关
       if (run){
           for(int i=0;i<10;i++){
               System.out.println(Thread.currentThread().getName()+"------------>"+i);
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }else{
           //return就结束了，在结束之前还有什么需要保存的
           //可以在这里保存
           //save....
           //终止当前线程
           return;
       }
    }
}