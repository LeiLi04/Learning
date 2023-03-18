package Review.CollectionTest;

import java.text.Collator;
import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorTest01 {
    public static void main(String[] args) {
    Tortoise tortoise01=new Tortoise(1);
    Tortoise tortoise02=new Tortoise(1000);
    Tortoise tortoise03=new Tortoise(10000);
    Tortoise tortoise04=new Tortoise(999);
    Tortoise tortoise05=new Tortoise(9999);
    TreeSet<Tortoise> tortoises=new TreeSet<>(new TortoiseComparator());
    tortoises.add(tortoise01);
    tortoises.add(tortoise02);
    tortoises.add(tortoise03);
    tortoises.add(tortoise04);
    tortoises.add(tortoise05);
        for (Tortoise tortoise:
             tortoises) {
            System.out.println(tortoise);
        }
    }
}
class Tortoise{
    int age;

    public Tortoise(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tortoise{" +
                "age=" + age +
                '}';
    }
}
//小乌龟比较器
class TortoiseComparator implements Comparator<Tortoise> {
    @Override
    public int compare(Tortoise o1, Tortoise o2) {
        return o2.age-o1.age;
    }
}