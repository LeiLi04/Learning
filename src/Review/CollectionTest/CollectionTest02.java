package Review.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class CollectionTest02 {
    public static void main(String[] args) {
        Collection arraylist01=new ArrayList();
        User u1=new User("Jack");
        User u2=new User("Jack");
        arraylist01.add(u1);
        System.out.println(arraylist01.contains(u2));

    }
}
class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
    //重写equals方法

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}