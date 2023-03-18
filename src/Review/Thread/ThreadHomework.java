package Review.Thread;

public class ThreadHomework {
    public static void main(String[] args) {
        Num num=new Num();
        Thread thread01=new Thread(new Odd(num));
        Thread thread02=new Thread(new Even(num));
        thread01.setName("t1");
        thread02.setName("t2");
        thread01.start();
        thread02.start();

    }
}
class Num{
    int anInt=1;
}
class Odd implements Runnable{
    //Property
    private Num num;
    //Constructor
    public Odd(Num num) {
        this.num = num;
    }
    @Override
    public void run() {
            //keep judging
            while (true) {
                synchronized (num) {
                if (num.anInt % 2 == 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(num.anInt==10){System.exit(0);}
                //is odd
                System.out.println(Thread.currentThread().getName()+"-------->"+num.anInt++);
                num.notifyAll();

        }}
    }
}
class Even implements Runnable{
    //Property
    private Num num;
    //Constructor
    public Even(Num num) {
        this.num = num;
    }
    @Override
    public void run() {
        //keep judging
        while (true) {
            synchronized (num) {
                if (num.anInt %2 != 0) {
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(num.anInt==10){System.exit(0);}
                //is odd
                System.out.println(Thread.currentThread().getName()+"-------->"+num.anInt++);
                num.notifyAll();

            }}
    }
}