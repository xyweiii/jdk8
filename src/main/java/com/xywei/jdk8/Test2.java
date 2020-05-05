package com.xywei.jdk8;

import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@FunctionalInterface
interface MyInterface {

    void test();

    @Override
    String toString();
}

public class Test2 {

    public void myTest(MyInterface myInterface) {
        System.out.println(1);
        myInterface.test();
        System.out.println(2);

    }

    public static void main(String[] args) {
//        Test2 test2 = new Test2();
//        //传统方法
//        test2.myTest(new MyInterface() {
//            @Override
//            public void test() {
//                System.out.println("myTest");
//            }
//        });
//        //lambda方式
//        test2.myTest(()->{
//            System.out.println("mytest");
//        });

        //构造函数 也是一种 Function
        //       (T t , T t1 ....T Tn)--> Apple(t1,t2....tn)  ==Funciton(T t ,T t1, T t2...T tn,Apple);

        List<Integer> weights = Arrays.asList(5, 8, 10, 100);

        List<Apple> apples = map(weights, Apple::new);

        System.out.println(apples);
    }


    public static List<Apple> map(List<Integer> weights, Function<Integer, Apple> f) {
        List<Apple> result = Lists.newArrayList();

        for (Integer weight : weights) {
            Apple apple = f.apply(weight);
            result.add(apple);
        }
        return result;
    }

}