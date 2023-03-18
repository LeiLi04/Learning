package Review.IOStreamTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest02 {
    public static void main(String[] args) {
        FileReader fileReader01=null;
        FileWriter fileWriter01=null;
        try {
            //1.Source
            fileReader01=new FileReader("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BinarySearch.java");
            fileWriter01=new FileWriter("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BiBabo.java");
            //2.Scale
            char[] chars=new char[1024*512];//500kb
            //3.write,写的时候是要有规模的
            int readCount=0;
            while ((readCount=fileReader01.read(chars))!=-1){
                fileWriter01.write(chars,0,readCount);
            }
            //4.flush
            fileWriter01.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter01.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileReader01.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
