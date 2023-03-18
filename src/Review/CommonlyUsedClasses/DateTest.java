package Review.CommonlyUsedClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        //知识点01：怎么获得系统当前时间
        Date d01=new Date();
        System.out.println(d01);
        //知识点02：Date————>String  SimpleDateFormat()
        SimpleDateFormat s1=new SimpleDateFormat("yyyy/MM/dd  HH:mm:ss:SSS");
        System.out.println(s1.format(d01));
        //知识点03：String--->Date
        String s2="07/04/2022";
        SimpleDateFormat s03=new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println(s03.parse(s2));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
