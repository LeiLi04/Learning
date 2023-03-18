package Review.Thread;

public class ThreadTest04 {
    //使用匿名内部类的方式，实现test03中的代码
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {//这里new的不是接口，而是接口的一个实现类，没有名字
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                System.out.println("branch---------->"+i);}
            }
        });
        //start the thread
        thread.start();
        //main for loop
        for(int j=0;j<1000;j++){
            System.out.println("main___________>"+j);
        }
    }
}
