package Review.Thread;

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        Account account=new Account("001",10000);
        ThreadSafe threadSafe01=new ThreadSafe(account);
        ThreadSafe threadSafe02=new ThreadSafe(account);
        threadSafe01.start();
        threadSafe02.start();
    }
}
