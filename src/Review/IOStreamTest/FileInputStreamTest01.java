package Review.IOStreamTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        /*java.io.FileInputStream:
            1.文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
            2.字节的方式，完成输入的操作，完成读的操作（硬盘————内存）    */
        //创建文件字节输入流对象
        //文件路径
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("Users/lilei/Documents/Pictures/WallPaper/City.png");
            System.out.println(fis.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //一定要关闭流，然后抖一抖
            if(fis!=null){//避免空指针异常
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
