package Review.Loop;

import javax.swing.*;
import java.util.Scanner;

public class Homework03_Factorial {
    //input one number, and out its factorial
    public static void main(String[] args) {
        java.util.Scanner s1= new Scanner(System.in);
        int sum=1;
        System.out.print("Please input one number");
        for(int i=s1.nextInt();i>0;i--){
            sum*=i;
        }
        System.out.println(sum);
    }
}
