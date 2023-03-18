package com.bjpowernode.java.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest0501 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class studentClass=Class.forName("com.bjpowernode.java.bean.Student");
        //com.bjpowernode.java.bean.Student
        String className=studentClass.getName();
        System.out.println("the whole name:"+className);
        //SimpleName
        String classSimpleName=studentClass.getSimpleName();
        System.out.println("the simple name:"+classSimpleName);

        //this method can only get the Field retouched by public
        Field[] fields=studentClass.getFields();
        System.out.println(fields.length);//get the length of array
        System.out.println(fields[0]);//get the 1st element of the array
        System.out.println(fields[0].getName());//get the name of the 1st element of the array

        //get all the Fields
        Field[] fs=studentClass.getDeclaredFields();
        System.out.println(fs.length);

        System.out.println("======================");

        //ergodic
        for(Field field: fs){
            //get the properties retouched list
            int i=field.getModifiers();//the returned modifier is a number, each number is a representation of the modifier
            System.out.println(i);
            //Can u transfer this number to a String
            System.out.println(Modifier.toString(i));
            //get the type of the Properties
            System.out.println(field.getType().getName());
            //get the name of each Properties
            System.out.println(field.getName());
        }


    }
}
