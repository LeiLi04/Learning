package Review.Method;

import java.util.Scanner;

public class MethodTest04_OverLoad {
    //通过方法重载，可以比较2个数字或是3数字的大小
    public static void main(String[] args) {
        System.out.println(getBigger(1,3));
        System.out.println(getBigger(1,9,4));


    }
    public static int getBigger(int a,int b){
        return a>b?a:b;
    }
    public static int getBigger(int a,int b,int c){
        return getBigger(a,b)>c?getBigger(a,b):c;
    }
}
