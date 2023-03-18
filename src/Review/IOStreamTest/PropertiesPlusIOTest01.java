package Review.IOStreamTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPlusIOTest01 {
    public static void main(String[] args) throws Exception {
        //IO+Properties联合的应用
        //非常好的一个设计理念
            //将来经常改变的数据，可以单独写到一个文件里，使用程序动态读取。
            //将来只需要修改这个文件的内容，java代码不需要改动，不需要重新编译，服务器也不需要重启，就可以拿到动态的信息
        //Properties是一个Map集合，key和value都是String类型，想讲userinfo中的文件数据加载到Properties对象当中
        //1.新建一个FileReader来读
        FileReader fileReader=new FileReader("/Users/lilei/IdeaProjects/Learning/src/userinfo.properties");
        //2.新建一个Map集合
        Properties properties=new Properties();
        //3.调用Properties对象的load方法将文件中的数据加载到Map集合中
        properties.load(fileReader);//=左边是key，=右边是value
        //4.通过key来获取value
        String username=properties.getProperty("username");
        String password=properties.getProperty("password");
        System.out.println(username+"|"+password);


    }
}
