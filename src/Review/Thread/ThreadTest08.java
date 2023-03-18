package Review.Thread;
/*
* sleep睡眠太久了，如果希望半路上醒来，你应该怎么做？也就是说如何叫醒一个正在睡眠的线程？？
*   注意：不是中断线程的执行，而是终止线程的睡眠*/
public class ThreadTest08 {
    public static void main(String[] args) {
        Thread t=new Thread(new MyRunnabel2());
        t.setName("t");
        t.start();

        //希望5s之后，t线程醒来
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断t线程的睡眠（这种中断睡眠的方式依靠了java的异常处理机制）
        t.interrupt();//干扰，一盆冷水过去
    }
}
class MyRunnabel2 implements Runnable{
    @Override
    //重点：run（）当中的异常不能throws，只能try，catch
    //因为run（）方法在父类中没有抛出任何异常，子类不能比父类抛出更多的异常
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---------->begin");
        //Sleep for a whole year
        try {
            Thread.sleep(1000*60*60*60*24*365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //一年之后到达了这里
        System.out.println(Thread.currentThread().getName()+"---------->end");
        //调用doOther()
//        doOther();
    }

//    private void doOter() throws Exception{//这个方法可以抛出异常，因为这不是extends过来的方法
//    }

}