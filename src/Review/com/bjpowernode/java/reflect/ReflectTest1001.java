package com.bjpowernode.java.reflect;

import com.bjpowernode.java.service.UserService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest1001 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        UserService userService=new UserService();
        System.out.println(userService.login("admin","123"));;//true
        //通过反射机制来调用一个对象的方法该怎么做
        //1. class
        Class userServiceClass=Class.forName("com.bjpowernode.java.service.UserService");
        //2. 对象
        Object obj=userServiceClass.newInstance();
        //3.get Method (depend on the name&形式参数)
        Method method=userServiceClass.getDeclaredMethod("login", String.class, String.class);
        //4.调用方法
            //01 方法
            //02 对象
            //03 形式参数
            //04 返回值
        Object retValue=method.invoke(obj,"admin","123");
        System.out.println(retValue);
    }
}
