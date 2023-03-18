package Review.IOStreamTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr01=null;
        try {
            //1.give a source
            fr01=new FileReader("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BinarySearch.java");
           //2.the array scale
            char[] chars=new char[4];
            //3.read
//            fr01.read(chars);
//            for (char c:
//                 chars) {
//                System.out.println(c);
//            }
            //3.read
            int readCount=0;
            while((readCount=fr01.read(chars))!=-1){
                System.out.println(new String(chars,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
