package Review.IOStreamTest;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class DataOutputStreamTest01 {
    public static void main(String[] args) throws Exception {
        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("/Users/lilei/IdeaProjects/Learning/src/Review/Array/BinarySearch.java",true));
        byte b=100;
        short s=200;
        int i=300;
        long l=400L;
        float f=3.0F;
        double d=3.14;
        boolean sex=true;
        char c='a';
        dataOutputStream.writeByte(b);
        dataOutputStream.writeShort(s);
        dataOutputStream.write(i);
        dataOutputStream.writeLong(l);
        dataOutputStream.writeFloat(f);
        dataOutputStream.writeDouble(d);
        dataOutputStream.writeBoolean(sex);
        dataOutputStream.writeChar(c);
        dataOutputStream.flush();
        dataOutputStream.close();
    }
}
