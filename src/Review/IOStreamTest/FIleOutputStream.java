package Review.IOStreamTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputStream {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            //1.给一个输出地址
            fos=new FileOutputStream("/Users/lilei/IdeaProjects/Learning/src/Review/Array/TestBinarySearch.java",true);
            //2.准备一个需要写的内容
            byte[] bytes={1,1,2,3,4,5,67,7};
            //3.将bytes全部写出去
            fos.write(bytes);
            //-----------------
            String s="我是一只小老虎小老虎";
            //String----bytes
            byte[] bytes1=s.getBytes();
            fos.write(bytes1);
            //4.写完之后抖一抖
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
