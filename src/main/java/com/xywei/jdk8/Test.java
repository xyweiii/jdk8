package com.xywei.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        //编译器根据list 可以推断出 i的类型
        list.forEach(i -> {
            System.out.println(i);
        });

        //也可以声明i类型
        list.forEach((Integer i) -> {
            System.out.println(i);
        });

        //方法引用形式
        list.forEach(System.out::println);
    }
}
