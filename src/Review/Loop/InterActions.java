package Review.Loop;

import java.util.Scanner;

public class InterActions {
    public static void main(String[] args) {
        //New a Scanner
        Scanner s1=new Scanner(System.in);
        System.out.println("Welcome to mathematic world, i'm a caculator");
        System.out.println("Please input the 1st num");
        int num1 =s1.nextInt();
        System.out.println("Please input the 2nd num");
        int num2=s1.nextInt();
        System.out.println("Too easy, and the answer is"+"="+(num1+num2));

    }
}
