package com.xywei.jdk8;

import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

import static java.util.Comparator.comparing;


/**
 * @author xywei
 */
@Data
public class Apple {

    private String color;

    private int weight;


    public Apple(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        List<Apple> appleList = Lists.newArrayList();
        appleList.sort(comparing(Apple::getWeight));
    }
}
