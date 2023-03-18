package Review.CollectionTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map01=new HashMap<>();
        //function:put
        map01.put(1,"王大狗");
        map01.put(2,"王二狗");
        map01.put(3,"王三狗");
        map01.put(4,"王四狗");
        map01.put(5,"王五狗");
        //Through key to get value
        String value01=map01.get(1);//大狗
        String value02=map01.get(5);//五狗
        //get the size of the map01
        int size01=map01.size();//5
        System.out.println(size01);
        //Through key to remove the value
        map01.remove(5);
        int size02=map01.size();
        System.out.println(size02);//4
        //if contain the key
        System.out.println(map01.containsKey(1));
        //if contain the value
        System.out.println(map01.containsValue("王五狗"));//flase
        //get all the values
        Collection<String> values=map01.values();
        for (String str01:
             values) {
            System.out.println(str01);
        }//大狗-四狗
        //clear the map
        map01.clear();
        System.out.println(map01.size());//0
        //is Empty?
        System.out.println(map01.isEmpty());//true
    }
}
