package Review.CollectionTest;

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<Integer> tre01 = new TreeSet();
        tre01.add(1);
        tre01.add(3);
        tre01.add(5);
        tre01.add(2);
        tre01.add(4);
        tre01.add(6);
        tre01.add(8);
        tre01.add(7);
        for (int i:
             tre01) {
            System.out.println(i);
        }



    }
}