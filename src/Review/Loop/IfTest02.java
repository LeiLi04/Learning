package Review.Loop;

import java.util.Scanner;

public class IfTest02 {
//    题目：
//            1.系统接受一个学生的考试出成绩，根据考试成绩输出成绩的等级
//		2.等级
//    优秀：[90-100]
//    良好：[80-90)
//    中等：[70-80)
//    及格：[60-70)
//    不及格：[0-60)
//            3.要求成绩是一个合法的数字，成绩必须要在[0-100]之间，成绩可能带有小数
public static void main(String[] args) {
    java.util.Scanner s1 =new Scanner(System.in);
    System.out.print("Please input num :");
    double num1=s1.nextDouble();
    String str="failed";
    if(num1<0||num1>100){
        System.out.println("Illegal num");
    }else if(num1>=90){
        System.out.println("excellent");
    }else if(num1>=80){
        System.out.println("good");
    }else if(num1>=70){
        System.out.println("medium");
    }else if(num1>=60){
        System.out.println("passed");
    }
}
}
