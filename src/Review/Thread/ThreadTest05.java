package Review.Thread;

import org.w3c.dom.ls.LSOutput;

public class ThreadTest05 {
    public static void main(String[] args) {
        Thread currentThread=Thread.currentThread();//这个方法出现在主线程中，返回的线程就是主线程
        System.out.println(currentThread.getName());//获取主线程的名字
        MyThread myThread=new MyThread();
        myThread.start();
        myThread.setName("Dulex");
        System.out.println(myThread.getName());;
        for (int j=0;j<100;j++){
            System.out.println("Main Thread-------->"+j);
        }
    }
}
class MyThread02 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("Branch Thread------->"+i);
        }
    }
}