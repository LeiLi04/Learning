package Review.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection arrayList=new ArrayList();
        arrayList.add(1);
        arrayList.add(new Object());
        arrayList.add(true);
        arrayList.remove(true);
        boolean b1=arrayList.contains(1);
        boolean b2=arrayList.contains(true);
        System.out.println(b1);
        System.out.println(b2);
        int i1=arrayList.size();
        System.out.println(i1);
        boolean b3=arrayList.isEmpty();
        System.out.println(b3);
        Object[] objects=arrayList.toArray();
        for (int i=0;i< objects.length;i++){
            System.out.println(objects[i]);
        }
    }
}
