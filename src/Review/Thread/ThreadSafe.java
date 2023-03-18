package Review.Thread;

public class ThreadSafe extends Thread{
    //2个线程必须共享同一个account对象
    private Account act;
    //通过constructor构造线程对象

    public ThreadSafe(Account act) {
        this.act = act;
    }
    //run()
    public void run(){
        //run()表示取款的操作
        //假设取款5000
        double money=5000;
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName()+"对"+act.getAccountName()+"取款"+money+"成功"+" 当前余额"+act.getBalance());
    }
}
