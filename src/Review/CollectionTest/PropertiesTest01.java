package Review.CollectionTest;

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个新的Properties对象
        Properties properties01=new Properties();
        //掌握Properties的2个方法
        //————————存：properties.setProperty(String str01,String Str02)
        properties01.setProperty("1","Jack");
        properties01.setProperty("2","Rose");
        properties01.setProperty("Username","Jackmon");
        properties01.setProperty("Password","123");
        //________取：properties.getProperty(String str01)
        System.out.println(properties01.getProperty("1"));
        System.out.println(properties01.getProperty("2"));
        System.out.println(properties01.getProperty("Username"));
        System.out.println(properties01.getProperty("Password"));
    }
}
