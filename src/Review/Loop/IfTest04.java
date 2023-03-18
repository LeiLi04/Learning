package Review.Loop;

import java.util.Scanner;

public class IfTest04 {
//    业务：
//    从键盘上接受天气的信息：
//            1表示：雨天
//				0表示：晴天
//            同时从键盘上接受性别的信息
//				1表示：男
//				0表示：女
//    业务要求；
//    当天起是雨天的时候
//    男的：打一把大黑伞
//    女的：打一把小花伞
//            当天气是晴天的时候
//    男的：直接走起，出去玩
//    女的：擦点防晒霜，出去玩
//    提示：需要使用if语句以及嵌套的方式展现这个业务
public static void main(String[] args) {
    //Scanner receive 2 value
    java.util.Scanner s1=new Scanner(System.in);
    System.out.println("Please input 0(sunny)&1(rainy)");
    int num1 = s1.nextInt();
    System.out.println("Please input 0(Female)&1(Male)");
    int num2=s1.nextInt();
    //1to2,2if
    if(num1==0){
        if (num2==0){
            System.out.println("AntiSunny");
        }else{
            System.out.println("Go out");
        }
    }else{
        if(num2==0){
            System.out.println("Take flower unbrella");
        }else{
            System.out.println("Tanke black unbrellac");
        }
    }
}
}
