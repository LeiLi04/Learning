package Review.CollectionTest;


import java.util.Comparator;
import java.util.TreeSet;

public class AnonymousTest01 {
    Dog dog01=new Dog(1);
    Dog dog02=new Dog(2);
    Dog dog03=new Dog(3);
    Dog dog04=new Dog(4);
    Dog dog05=new Dog(55);
    //小狗构造器匿名内部类写法
    TreeSet<Dog> dogs=new TreeSet<Dog>(new Comparator<Dog>(){
        public int compare(Dog dog01,Dog dog02){
            return dog02.age-dog01.age;
        }
    });


}
class Dog{
    int age;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                '}';
    }
}
