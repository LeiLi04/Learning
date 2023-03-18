package Review.CollectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CollectionTest05 {
    public static void main(String[] args) {
        //ArrayList的另一种构造方法
        List myList01=new ArrayList();
        List myList02=new ArrayList(100);
        Collection c=new HashSet();
        c.add(100);
        c.add(200);
        c.add(300);
        List myList03=new ArrayList(c);
        for(int i=0;i< c.size();i++){
            System.out.println(myList03.get(i));
        }
    }
}
