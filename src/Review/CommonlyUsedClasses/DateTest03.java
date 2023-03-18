package Review.CommonlyUsedClasses;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest03 {
    public static void main(String[] args) {
        //这个时间是什么时间？
        //1970-01-01 00：00：00：001
        //这个Date类的实参是SSS（毫秒）
        Date date01=new Date(1);
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        //Italy这里只差一个hour
        System.out.println(sdf.format(date01));
        //获取昨天的时间
        Date date02=new Date(System.currentTimeMillis()-1000*60*60*24);
        System.out.println(sdf.format(date02));
        //获取date的sdf格式的时间
        System.out.println(sdf.format(date01));
    }
}
