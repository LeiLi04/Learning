package Review.Loop;

import java.util.Scanner;

public class IfTest03 {
    //use switch to solve the IfTest02
    public static void main(String[] args) {
        java.util.Scanner s1=new Scanner(System.in);
        System.out.println("Please input your num");
        double num1= s1.nextDouble();
        if(num1<0||num1>100){
            System.out.println("Illegal num");
            return;
        }
        String str="Failed";
        int num02=(int)(num1/10);
        switch (num02){
            case 9: case 10:
                str="Excellent";
                break;
            case 8:
                str="good";
                break;
            case 7:
                str="medium";
                break;
            case 6:
                str="passed";
                break;
        }
        System.out.println(str);
    }
}
