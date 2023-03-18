package chapter26.src.com.bjpowernode.java.annotation7;

import java.lang.reflect.Field;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c=Class.forName("chapter26.src.com.bjpowernode.java.annotation7.User01");
        if(c.isAnnotationPresent(MustHasIdPropertyAnnotation.class)){
            Field[] field=c.getDeclaredFields();
            boolean isOK=false;
            for (Field field01:field
                 ) {
                if("id".equals(field01.getName())&&"int".equals(field01.getType().getSimpleName())){
                    isOK=true;
                }
            }
            if(!isOK){
                throw new ClassNotFoundException("小逼崽子，被@MustHasIdPropertyAnnotation注解标注的类必须要有一个int类型的id属性");
            }
        }
    }
}
