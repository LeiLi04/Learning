package Review.CollectionTest;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Integer> set01=new HashSet<>();
        set01.add(1);
        set01.add(2);
        set01.add(3);
        set01.add(4);
        set01.add(1);
        for (Integer i:
             set01) {
            System.out.println(i);
        }
    }
}
