package chapter26.src.com.bjpowernode.java.annotation6;

import java.lang.reflect.Method;

public class MyAnnotationTest01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class c=Class.forName("chapter26.src.com.bjpowernode.java.annotation6.MyAnnotationTest");
        Method m=c.getDeclaredMethod("doSome");
        MyAnnotation myAnnotation=m.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.username());
        System.out.println(myAnnotation.password());

    }
}
