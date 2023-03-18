package Review.Loop;

import java.util.Scanner;

public class Homework04_if {
    /*
	从控制台接收一个正整数，判断该数是否为质数
		质数：在>1的自然数中，except1&它本身以外，不再有任何其他因数的自然数
*/
    public static void main(String[] args) {
        java.util.Scanner s1=new Scanner(System.in);
        System.out.print("Please input one number :");
        int i1=s1.nextInt();
        int a1=i1-1;
        String str="Yes";
        for(;a1>1;a1--){
            if(i1%a1==0){
                str="no 质数";
                break;
            }
        }System.out.println(str);
    }
}
