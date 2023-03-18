package Review.Loop;

import java.util.Scanner;

public class SwitchTest01 {
    public static void main(String[] args) {
        System.out.print("Please input : Fuck u");
        java.util.Scanner s1=new Scanner(System.in);
        String str=s1.next();
        switch (str){
            case "Fuck":
                System.out.println("Be a gentleman");
                break;
            default:
                System.out.println("Please input 'Fuck u'");
        }
    }
}
