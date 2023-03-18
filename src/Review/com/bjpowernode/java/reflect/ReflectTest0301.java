package Review.com.bjpowernode.java.reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest0301 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        //1.1.带source的ioStream
        FileReader fileReader=new FileReader("/Users/lilei/IdeaProjects/Learning/src/classinfo2.properties");
        //1.2.流的end
        Properties properties=new Properties();
        //1.3.流进去
        properties.load(fileReader);
        //1.4.close Stream
        fileReader.close();
        //2.Through map's key to get the value
        String strClassName=properties.getProperty("className");
        //3.通过反射机制实例化对象
        Class c=Class.forName(strClassName);
        Object object=c.newInstance();
        System.out.println(object);

    }
}
