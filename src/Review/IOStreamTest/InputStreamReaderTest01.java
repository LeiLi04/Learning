package Review.IOStreamTest;

import java.io.*;

public class InputStreamReaderTest01 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BinarySearch.java")));
        String s=null;
        while((s=bufferedReader.readLine())!=null){
            System.out.println(bufferedReader.readLine());
        }
        bufferedReader.close();
    }
}
