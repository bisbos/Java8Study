package com.java8;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(3,2));

        Comparator<Integer> comparatorLambda = (Integer o1,Integer o2) -> o1.compareTo(o2);
        System.out.println(comparatorLambda.compare(3,2));

        Comparator<Integer> comparatorLambda1 = (o1,o2) -> o1.compareTo(o2);
        System.out.println(comparatorLambda1.compare(3,2));


    }
}
