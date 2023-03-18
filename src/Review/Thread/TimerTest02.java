package Review.Thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest02 {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        Date date=simpleDateFormat.parse("2022-4-18 23:45:00 000");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
                String strTime=simpleDateFormat1.format(new Date());
                System.out.println(strTime+"成功备份了一次");
            }
        },date,10*1000);

    }
}
