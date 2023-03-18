package Review.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTest1502 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask futureTask=new FutureTask(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("call begin");
                Thread.sleep(10*1000);
                System.out.println("call end");
                int a=10;
                int b=10;
                return a+b;
            }
        });
        Thread thread=new Thread(futureTask);
        thread.start();
        Object object=futureTask.get();
        System.out.println("结果是----->"+object);
    }
}
