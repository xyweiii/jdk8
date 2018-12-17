package com.xywei.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        TheInterface i1 = () -> {
        };
        System.out.println(i1.getClass().getInterfaces()[0]);

        TheInterface2 i2 = () -> {
        };
        System.out.println(i2.getClass().getInterfaces()[0]);
        //result
        // interface com.xywei.jdk8.TheInterface
        //interface  com.xywei.jdk8.TheInterface2

        new Thread(() -> {
            System.out.println("hello world");
        }).start();

        //操作集合
        List<String> list = Arrays.asList("hello", "world", "hello world");
//        list.forEach(item -> System.out.println(item.toUpperCase()));


        List<String> list2 = new ArrayList<>();

//        list.forEach(item -> list2.add(item.toUpperCase()));
//        list2.forEach(item -> System.out.println(item.toUpperCase()));
//        list.stream().map(item -> item.toUpperCase()).forEach(item -> System.out.println(item));

        //方法引用形式
        list.stream().map(String::toUpperCase).forEach(item -> System.out.println(item));


    }
}

@FunctionalInterface
interface TheInterface {

    void myMethod();
}


@FunctionalInterface
interface TheInterface2 {
    void myMethod2();
}