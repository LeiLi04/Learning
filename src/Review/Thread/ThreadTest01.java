package Review.Thread;

public class ThreadTest01 {
    public static void main(String[] args) {
        /*
        * 大家分析一下以下程序一个有几个线程（除了GC线程）
        * 我觉得1个*/
        System.out.println("mainBegin");
        m1();
        System.out.println("mainEnd");
    }

    private static void m1() {
        System.out.println("m1 Begin");
        m2();
        System.out.println("m1 Over");
    }

    private static void m2() {
        System.out.println("m2 Begin");
        m3();
        System.out.println("m2 End");
    }

    private static void m3() {
        System.out.println("m3 Execute");
    }
}
