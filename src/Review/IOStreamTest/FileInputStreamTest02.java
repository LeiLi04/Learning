package Review.IOStreamTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            //1.给fis一个数据源
            fis=new FileInputStream("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BinarySearch.java");
            //2.准备一个数组
            byte[] bytes=new byte[4];
            //function:跳过几个bytes不读
            fis.skip(3);
            //3.把bytes转换成String，读到多少转换到多少
            int readCount=0;
                //这里用fis.按照bytes读取
            while((readCount= fis.read(bytes))!=-1){
                System.out.println(new String(bytes,0,readCount));
            }
            //function:fis.availbale();
            System.out.println(fis.available());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
