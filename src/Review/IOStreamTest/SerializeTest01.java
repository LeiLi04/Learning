package Review.IOStreamTest;

import java.io.*;

public class SerializeTest01 {
    public static void main(String[] args) throws IOException {
        //创建一个新对象
        Students students=new Students("Jack","1110");
        //1.new出来一个ObjectOutputStream, constructor有一个OutputStream的抽象类，直接new一个文件输出流
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("Students"));
        //2.Serialize
        objectOutputStream.writeObject(students);
        //3.flush
        objectOutputStream.flush();
        //4.close
        objectOutputStream.close();
    }
}
//Just a normal class Students
class Students implements Serializable{
    private String name;
    private String num;
    //

    public Students() {
    }

    public Students(String name, String num) {
        this.name = name;
        this.num = num;
    }
    //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}