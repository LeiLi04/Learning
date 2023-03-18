package Review.CollectionTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> maps=new HashMap<>();
        maps.put(1,"赵一");
        maps.put(2,"赵二");
        maps.put(3,"赵三");
        maps.put(4,"赵四");
        maps.put(5,"赵五");
        //key重复则会直接覆盖
        maps.put(3,"刘能");
        System.out.println(maps.size());//5
        //遍历
        //结果说明HashMap的Key部分元素无序且不可重复
        Set<Map.Entry<Integer,String>> nodes=maps.entrySet();
        for (Map.Entry<Integer,String> node01:
             nodes) {
            System.out.println(node01);
        }

    }
}
