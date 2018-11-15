package com.java8.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {
        printName();
    }

    // UnaryOperator extends Function. UnaryOperator can be used when the input and output are of same type
    public static void printName(){
        UnaryOperator<String> names = (name)-> name.toUpperCase();
        System.out.println(names.apply("Bisin"));
    }

}
