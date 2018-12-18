package com.xywei.jdk8;

import java.util.*;

public class StringComparator {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

//        Collections.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println(names);

        Collections.sort(names, (String o1, String o2) -> {
            return o2.compareTo(o1);
        });

        // statemaent
        Collections.sort(names, ( o1,  o2) -> {
            return o2.compareTo(o1);
        });

        // expression
        Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

        System.out.println(names);

    }

}
