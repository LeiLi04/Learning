package Review.IOStreamTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerializeTest02 {
    public static void main(String[] args) throws Exception {
        //1.new 一个输入对象流
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("students"));
        //2.反序列化回来是一个学生对象，所以会调用学生对象的toString方法
        Object object=objectInputStream.readObject();
        System.out.println(object);
        //3.close
        objectInputStream.close();

    }
}
