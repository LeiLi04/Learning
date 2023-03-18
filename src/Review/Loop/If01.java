package Review.Loop;

import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
//        业务要求：
//        1、从键盘上接收一个人的年龄。
//        2、年龄要求为[0-150]，其它值表示非法，需要提示非法信息。
//        3、根据人的年龄来动态的判断这个人属于生命的哪个阶段？
//			[0-5] 婴幼儿
//                [6-10] 少儿
//                [11-18] 少年
//                [19-35] 青年
//                [36-55] 中年
//                [56-150] 老年
//        4、请使用if语句完成以上的业务逻辑。
        Scanner s1=new Scanner(System.in);
        System.out.print("Please input your age :");
        int age = s1.nextInt();
        String str ="the old";
        if(age<=0||age>=150){
            System.out.println("The value is illegal");
            return;
        }else if(age<=5){
            System.out.println("婴幼儿");
        }else if(age<=18){
            System.out.println("少儿");
        }else if(age<=35){
            System.out.println("少年");
        }else{
            System.out.println("中年");
        }

    }
}
