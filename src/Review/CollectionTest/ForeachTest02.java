package Review.CollectionTest;

import java.util.ArrayList;
import java.util.List;

public class ForeachTest02 {
    public static void main(String[] args) {
        List<String> list01=new ArrayList<String>();
        list01.add("Jack");
        list01.add("Rose");
        list01.add("Jackman");
        list01.add("Lusy");
        for (String s:
            list01 ) {
            System.out.println(s);
        }
    }
}
