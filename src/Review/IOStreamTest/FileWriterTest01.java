package Review.IOStreamTest;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fw=null;
        try {
            //1.Source
            fw=new FileWriter("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BiBaBo.java");
            //2.char
            char[] chars={'我','是','一', '只','小','老','虎'};
            //3.write
            fw.write(chars);
            //4.flush
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
