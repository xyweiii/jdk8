package com.xywei.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest2 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        PredicateTest2 predicateTest2 = new PredicateTest2();
        //偶数
        predicateTest2.condiditonFilter(list, item -> item % 2 == 0);
        //奇数
        predicateTest2.condiditonFilter(list, item -> item % 2 != 0);

        //全部打印
        predicateTest2.condiditonFilter(list, item -> true);
        //全部不打印
        predicateTest2.condiditonFilter(list, item -> false);

    }


    public void condiditonFilter(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer integer : list) {
            if (predicate.test(integer)) {
                System.out.println(integer);
            }
        }
    }
}
