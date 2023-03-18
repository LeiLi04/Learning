package Review.CollectionTest;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection arrayList=new ArrayList();
        Iterator iterator01=arrayList.iterator();
        arrayList.add(1);
        ArrayList arrayList02=(ArrayList)arrayList;
        arrayList02.add(1,1);
        arrayList.add(2);
        Iterator iterator02=arrayList.iterator();
        while (iterator02.hasNext()){
            System.out.println(iterator02.next());
        }
    }
}
