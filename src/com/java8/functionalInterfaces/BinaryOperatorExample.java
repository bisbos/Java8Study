package com.java8.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {
        printNames();
    }

    //BinaryOperator extends BiFunction. BinaryOperator can be used when the inputs and output are of same type
    public static void printNames(){
        BinaryOperator<Integer> multiply = (a,b) -> a*b;
        System.out.println(multiply.apply(10,5));

        Comparator<Integer> comparator = (a,b)->a.compareTo(b);
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(10,20));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(10,20));
    }
}
