package Review.IOStreamTest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferTest01 {
    public static void main(String[] args) throws Exception {
        FileReader fileReader=new FileReader("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BinarySearch.java");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String s=null;
        while((s=bufferedReader.readLine())!=null){
            System.out.println(s);
        }
        bufferedReader.close();
    }
}
