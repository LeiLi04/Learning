package Review.IOStreamTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) throws IOException {
        /*//1.创建一个新文件
        File file=new File("/Users/lilei");
        //2.判断文件是否存在
        file.exists();
        //3.如果文件不存在，则以文件的形式创建
        if(!(file.exists())){
            file.createNewFile();
        }
        //4.如果文件不存在，则以目录的形式创建
        if(!(file.exists())){
            file.mkdir();
        }*/
        //5.创建多重目录
       File f2=new File("/Users/lilei/IdeaProjects/a/b/c/d/e");
       if(!f2.exists()){
            f2.mkdirs();
        }
        /*//6.获取文件的父路径
        System.out.println(f2.getParent());
        //7.获得父文件
        System.out.println(f2.getParentFile());
        //8.获得父文件绝对路径
        System.out.println(f2.getParentFile().getAbsolutePath());*/
        //9.获取文件名
//        System.out.println(f2.getName());
//        //10.判断是否是一个目录
//        System.out.println(f2.isDirectory());
//        //11.判断是否是一个文件
//        System.out.println(f2.isFile());
//        //12.获取最后一次文件的修改日期,获得1970年到现在的总毫秒数
//        long haomiao=f2.lastModified();
//            //time
//        Date date=new Date(haomiao);
//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//        System.out.println(simpleDateFormat.format(date));
//        //13.获取文件大小
//        System.out.println(f2.length());
        //14.获取所有自文件
//        File file01=new File("/Users/lilei/IdeaProjects/a");
//        File[] files=file01.listFiles();
//        for (File file:
//             files) {
//            System.out.println(file.getName());
//        }

    }
}
