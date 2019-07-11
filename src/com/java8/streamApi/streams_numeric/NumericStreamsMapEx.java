package com.java8.streamApi.streams_numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapEx {

    public static void main(String[] args) {
        System.out.println(mapToObjEx());
        System.out.println(mapToLongEx());
    }


    // Convert each element in Numeric Stream to Object
    public static List<Integer> mapToObjEx(){
        return IntStream.rangeClosed(1,10).mapToObj(i -> {
            return new Integer(i);
        } ).collect(Collectors.toList());
    }

    // Convert Numeric Stream to Long Stream
    public static long mapToLongEx(){
            return IntStream.rangeClosed(1,10).mapToLong(i -> i).sum();
    }
}
