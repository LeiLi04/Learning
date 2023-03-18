package Review.IOStreamTest;


import java.io.*;

public class CopyAll {
    public static void main(String[] args) {
        //拷贝Source
        File srcFile=new File("/Users/a");
        //拷贝目标
        File destFile=new File("/Users/lilei/IdeaProjects/Learning");
        copyDir(srcFile,destFile);
    }
    private static void copyDir(File scrFile,File destFile){
        FileInputStream in=null;
        FileOutputStream out=null;
        if(scrFile.isFile()){
            try {
                in=new FileInputStream(scrFile);
                String path="destFile.getAbsolutePath().endsWith(\"/\")?destFile.getAbsolutePath():destFile.getAbsolutePath()+\"/\"+scrFile.getAbsolutePath().substring(7)";
                out=new FileOutputStream(path);
            byte[] bytes=new byte[1024*1024];
            int readCount=0;
            while ((readCount=in.read(bytes))!=-1){out.write(bytes,0,readCount);}
            out.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e01) {
                e01.printStackTrace();
            }finally{
                try {
                    if(out!=null) {
                        out.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    if(in!=null) {
                        in.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        File[] files=scrFile.listFiles();
        for (File file:
             files) {
            if(file.isDirectory()){
                String srcDir=file.getAbsolutePath();
                String destDir=(destFile.getAbsolutePath().endsWith("/"))?destFile.getAbsolutePath():destFile.getAbsolutePath()+"/"+srcDir.substring(7);
                File file02=new File(destDir);
                if(!file02.exists()){
                file02.mkdirs();
            }
                copyDir(scrFile,destFile);
        }
    }

}
}
