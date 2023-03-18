package com.bjpowernode.java.reflect;

import com.bjpowernode.java.bean.Student;

import java.lang.reflect.Field;

public class ReflectTest0701 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Student student=new Student();
        student.no=100;
        System.out.println(student.no);
        //1.对象
        Class studentClass = Class.forName("com.bjpowernode.java.bean.Student");
        Object object=studentClass.newInstance();
        //2.属性
        Field noField=studentClass.getDeclaredField("no");
        //3.赋值
        noField.set(object,2000);
        System.out.println(noField.get(object));
    }
}
