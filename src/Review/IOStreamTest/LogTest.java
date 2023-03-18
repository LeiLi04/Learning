package Review.IOStreamTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

class Logger{
    public static void log(String s){

        try {
            //定义 log文件地址为输出地址
            PrintStream printStream = new PrintStream(new FileOutputStream("/Users/lilei/IdeaProjects/Learning/src/Review/Array/Log.java",true));
            System.setOut(printStream);
            //Date
            Date date=new Date();
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
            String time01=simpleDateFormat.format(date);
            //输出log为时间：事件
            System.out.println("//"+time01+":"+s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //

    }
}
public class LogTest{
    public static void main(String[] args) {
        Logger.log("吃了个大包子");
        Logger.log("喝了两杯奶");
        Logger.log("吃个桃桃好凉凉");
        Logger.log("喝个牛奶好烫烫");
    }
}