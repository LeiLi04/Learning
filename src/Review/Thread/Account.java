package Review.Thread;

class Account {
    //Properties: accountName; balance
    private String accountName;
    private double balance;
    //Method
        //constructor

    public Account() {
    }

    public Account(String accountName, double balance) {
        this.accountName = accountName;
        this.balance = balance;
    }
        //set&get

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
        //withdraw
        //以下这几行代码一定要是线程安全的，不能并发的
        //一个线程只有完全执行结束之后，另一个线程才能进来
    public void withdraw(double money){
        /*线程同步机制的语法：
        *   synchronized（）{
        *   线程同步代码块
        *   }
        *   （）里面的数据是相当重要的，
        *   这个数据必须是多线程共享的数据。才能打到多线程排队
        *
        *   ()中写什么？
        *       那就要看你想让哪些线程同步。
        *       假设t1,t2,t3,t4,t5，有5个线程
        *       你只希望1，2，3排队，不希望4，5排队，怎么办？
        *       你一定要在()写1，2，3共享的对象，而这个对象对于t4,t5来说，不是共享的
        *
        *   Java语言中，任何一个对象都有"一把锁"，其实这把锁就是标记。（只是把它叫做锁）
        *
        *   以下代码的执行原理？
        *       1。假设t1和t2线程并发，开始执行以下代码的时候，肯定有一个先一个后
        *       2。假设t1先执行了，遇到了synchronized，这个时候自动找"后面共享对象"的对象锁，
        *           找到之后，并且占有这把锁，然后执行同步代码块中的程序，在程序执行过程中一直都是占有这把锁。直到同步代码块代码结束，
        *           这把锁才会释放
        *       3。假设t1已经占有了这把锁，此时t2也遇到synchronized关键字，也会去占有后面共享对象的这把锁，结果这把锁被t1占有，t2
        *           只能在同步代码块外面等待t1的技术，直到t1把同步代码块执行结束了，t1会归还这把锁，此刻t2终于等到了这把锁，然后
        *           t2战友这把锁之后，进入同步代码块执行程序
        *
        *           这样就到达了线程排队执行
        *           这里需要注意的是：这个共享对象一定要选好了。这个共享对象一定是你需要排队执行的这些线程对象所共享的*/
        synchronized (this){
            double before=this.balance;
            double after=this.balance-money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setBalance(after);
        }
    }
}
