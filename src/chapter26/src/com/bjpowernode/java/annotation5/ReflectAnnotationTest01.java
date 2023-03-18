package chapter26.src.com.bjpowernode.java.annotation5;

public class ReflectAnnotationTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c=Class.forName("chapter26.src.com.bjpowernode.java.annotation5.MyAnnotationTest");
        System.out.println(c.isAnnotationPresent(MyAnnotation.class));//true
        if(c.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation myAnnotation= (MyAnnotation) c.getAnnotation(MyAnnotation.class);
            String value=myAnnotation.value();
            System.out.println(value);
        }
        Class stringClass=Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation.class));//false

    }
}
