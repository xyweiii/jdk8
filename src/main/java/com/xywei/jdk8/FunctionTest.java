package com.xywei.jdk8;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();

        System.out.println(test.compute(1, value -> {
            return 2 * value;
        }));
        System.out.println(test.compute(2, value -> 5 + value));
        System.out.println(test.compute(3, value -> value * value));



        System.out.println(test.convert(5, value -> value + "helloworld"));

        //事先声明Function变量
        Function<Integer, Integer> function = value -> value * 2;

        System.out.println(test.compute(4, function));

    }

    public int compute(int a, Function<Integer, Integer> function) {
        int result = function.apply(a);
        return result;
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }
}
