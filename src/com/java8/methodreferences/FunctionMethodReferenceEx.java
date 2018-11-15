package com.java8.methodreferences;

import java.util.function.Function;

public class FunctionMethodReferenceEx {

    public static void main(String[] args) {
        Function<String,String> toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.apply("bisin"));

        Function<String,String> methodRef = String::toUpperCase;
        System.out.println(methodRef.apply("bisin"));
    }
}
