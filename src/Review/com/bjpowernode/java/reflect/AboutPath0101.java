package com.bjpowernode.java.reflect;

public class AboutPath0101 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath());
    }
}
