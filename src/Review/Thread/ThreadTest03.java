package Review.Thread;

public class ThreadTest03 {
    public static void main(String[] args) {
        /*MyRunable myRunable=new MyRunable();
        Thread thread=new Thread(myRunable);*/
        Thread thread=new Thread(new MyRunable());//代码合并成一行
        thread.start();
        for(int j=0;j<1000;j++){
            System.out.println("main Thread is processing------>"+j);
        }
    }
}
class MyRunable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(" branch is processing------>"+i);
        }
    }
}