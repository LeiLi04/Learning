package Review.CollectionTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer,String> map01=new HashMap<>();
        map01.put(1,"刘一能");
        map01.put(2,"刘二能");
        map01.put(3,"刘三能");
        map01.put(4,"刘四能");
        map01.put(5,"刘五能");
        //*******************第一种方法，通过map.get(i)******************
//            //----------------第一种方式：通过iterator来取出key--------------
//            //将Key作为一个集合
//        Set<Integer> keys=map01.keySet();
//            //用Collection的Iterator
//        Iterator it01=keys.iterator();
//        while (it01.hasNext()){
//            Integer integer= (Integer) it01.next();
//            System.out.println(map01.get(integer));
//            //----------------第二种方式：通过foreach来获得key---------------
//        Set<Integer> keys=map01.keySet();
//            for (Integer i:
//                 keys) {
//                System.out.println(map01.get(i));
//            }
        //*****************第二种方式：Set<Map.Entry<K,V>> entrySet()******************
        //此方法将Map集合完全转换成Set集合
        //Set集合中目前的元素类型是Map.Entry
        Set<Map.Entry<Integer,String>> nodes=map01.entrySet();
//        //-----------第一种方式---------iterator
//        Iterator it02= nodes.iterator();
//        while (it02.hasNext()){
//            Map.Entry<Integer,String> node01= (Map.Entry<Integer, String>) it02.next();
//            int i01=node01.getKey();
//            String str02=node01.getValue();
//            System.out.println(i01+"="+str02);
//        }
        //------------第二种方式-----------foreach
        for (Map.Entry<Integer,String> node:
             nodes) {
            System.out.println(node.getKey()+"="+node.getValue());
        }
        }
    }

