package Review.StaticAndThis;

import java.util.Scanner;

public class Homework01_NumComparation {

    public static void main(String[] args) {


        //定义一个类B，对A类的实例变量v进行猜测
        //如果大了则提示大了
        //如果笑了则提示小了
        //等于则提示猜测成功
        A a = new A(50);
        B b = new B(a);
        java.util.Scanner s1 = new Scanner(System.in);
        while(true){
            System.out.println("Please input your value");
            b.compare(s1.nextInt());
        }
    }
}
//write a class A, with variable
class A{
    private int v;
//constructor

    public A() {
    }

    public A(int v) {
        this.v = v;
    }
    //set and get

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
//class B, which will include a , and the method compare
class B{
    //variable a
   private A a;
    //constructor

    public B(A a) {
        this.a = a;
    }

    public B() {
    }
    //set and get

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
    //method: compare
    public void compare(int value){
        if(value>this.getA().getV()){
            System.out.println("bigger");
        }else if(value<this.getA().getV()){
            System.out.println("smaller");
        }else{
            System.out.println("Right");
            //quit JVM
            System.exit(0);
        }
    }
}