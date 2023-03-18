package Review.IOStreamTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) {
        FileInputStream fileInputStream01=null;
        FileOutputStream fileOutputStream01=null;
        //1.给fis一个source
        //同时给fos一个destination
        try {
            fileInputStream01=new FileInputStream("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BinarySearch.java");
            fileOutputStream01=new FileOutputStream("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BiBaboTest.java",true);
            //2.Bytes
            byte[] bytes=new byte[1024*1024];//1M
            //3.fis
            int readCount=0;
            while ((readCount=fileInputStream01.read(bytes))!=-1){
                //4.fos
                fileOutputStream01.write(bytes,0,readCount);
            }
            //5.抖一抖
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fileInputStream01!=null){
                fileInputStream01.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fileOutputStream01!=null) {
                    fileOutputStream01.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
