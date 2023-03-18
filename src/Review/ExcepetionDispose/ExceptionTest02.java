package Review.ExcepetionDispose;

import java.util.Scanner;

public class ExceptionTest02 {
    public static void main(String[] args) {


        UserService us01 = new UserService();
        java.util.Scanner s01 = new Scanner(System.in);
        String username = s01.next();
        String password = s01.next();
        try {
            us01.register(username,password);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }
}
//    编写程序模拟用户注册：
//            1、程序开始执行时，提示用户输入“用户名”和“密码”信息。
//            2、输入信息之后，后台java程序模拟用户注册。
//            3、注册时用户名要求长度在[6-14]之间，小于或者大于都表示异常。
//
//
//    编写main方法，在main方法中接收用户输入的信息，在main方法
//    中调用UserService的register方法完成注册。

//    完成注册的方法放到一个单独的类中。
//    异常类自定义即可。
class UserService{
    //method:register
    public void register(String username,String password) throws UserException {
        if(username.length()<6||username.length()>14){
            throw new UserException("username illegal");
        }
        System.out.println("Register Successfully");
    }
}
class UserException extends Exception{
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }
}