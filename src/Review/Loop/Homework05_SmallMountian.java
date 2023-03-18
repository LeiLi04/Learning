package Review.Loop;

import java.util.Scanner;

public class Homework05_SmallMountian {
    public static void main(String[] args) {
        /*
	从键盘接受一个正整数，该正整数作为行数，输出以下图形
	emmm我这里就不画了，像个山一样
	i是行数，列数是（2n-1）
	第一行是2n-1
*/
        java.util.Scanner s1=new Scanner(System.in);
        System.out.println("请输入正整数");
        int allRow=s1.nextInt();
        for(int row=1;row<=allRow;row++){
            for(int i=1;i<= allRow-row;i++){
                System.out.print(" ");
            }for(int k=1;k<=2*row-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
