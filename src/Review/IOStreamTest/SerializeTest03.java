package Review.IOStreamTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SerializeTest03 {
    public static void main(String[] args) throws Exception {
        //看看能不能序列化多个对象
        //1.新建一个arrayList数组,把User一个一个加进去
        List<Users> usersList=new ArrayList<Users>();
            //
        usersList.add(new Users("Jack01",1));
        usersList.add(new Users("Jack02",2));
        usersList.add(new Users("Jack03",3));
        usersList.add(new Users("Jack04",4));
        usersList.add(new Users("Jack05",5));
        //2.new ObjectOutputStream,then put the userList into the writeObject();
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("users"));

        objectOutputStream.writeObject(usersList);
        //3.flush
        objectOutputStream.flush();
        //4.close
        objectOutputStream.close();

    }
}
//Normal class
class Users implements Serializable {
    //Properties
    private transient String name;//transient表示游离，不参与序列化
    private int age;
    //constructor

    public Users() {
    }

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //set&get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //ToString

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}