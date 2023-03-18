package Review.IOStreamTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class SerializeTest04 {
    public static void main(String[] args) throws Exception {
        //1.new ObjectInputStream,then
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("users"));
        //2.读回来一个数组，强制类型转换一下，拿到自己的数组里面
        List<Users> usersList=(List<Users>)objectInputStream.readObject();
        //3.取出来
        for (Users user:
             usersList) {
            System.out.println(user);
        }
        //4.close
        objectInputStream.close();
    }
}
