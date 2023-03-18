package Review.Method;

import java.util.Scanner;

public class Homework01_Recursion_Factrial {
    //使用递归的方式计算阶乘
    public static void main(String[] args) {
        java.util.Scanner s1=new Scanner(System.in);
        System.out.print("Please inout your num:");
        int num=s1.nextInt();
        System.out.println(factorial(num));

    }
    //Recursion:factorial
    public static int factorial(int num){
        if(num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
