package Review.CommonlyUsedClasses;

public class DateTest02 {
    public static void main(String[] args) {
        //输出一下1970年到现在过了多少秒
        long time=System.currentTimeMillis();
        System.out.println(time);
        //记录一下一个方法需要的时间
        long begin=System.currentTimeMillis();
        print01();
        long end =System.currentTimeMillis();
        System.out.println("需要的时间是："+(end-begin)+"s");
    }
    //for loop
    public static void print01(){
    for(int i=0;i<1000;i++){
        System.out.println(i);
    }
    }
}
