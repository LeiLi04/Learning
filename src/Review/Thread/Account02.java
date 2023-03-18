package Review.Thread;

class Account02 {
    //Properties: accountName; balance
    private String accountName;
    private double balance;
    //Method
        //constructor

    public Account02() {
    }

    public Account02(String accountName, double balance) {
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
       //可以在实例方法上使用sychronized嘛？可以的
       //   synchronized出现在实例方法上，一定锁的是this
        //没得挑，只能是this，不能是其他的对象。
        //所以这种方式不灵活

        //另外还有一个缺点：synchronized出现在实例方法上表示整个方法体都需要同步，可能会无故扩大同步的范围，导致程序的执行效率降低
        //所以这种方式不常用

        //synchronized使用在实例方法上有什么优点？
        //  代码写的少了
        //  如果共享的对象就是this，并且需要同步的代码块是整个方法体，建议使用这种方式
    public synchronized void withdraw(double money){

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
