package com.java8.streamApi.streams_numeric;

import java.io.InputStream;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static void main(String[] args) {


        IntStream intStream = IntStream.range(1,50);
        System.out.println(intStream.count());
        IntStream.range(1,50).forEach(System.out::println);

        System.out.println("-------------");
        IntStream intStreamClosedRange = IntStream.rangeClosed(1,50);
        System.out.println(intStreamClosedRange.count());
        IntStream.rangeClosed(1,50).forEach(System.out::println);

        System.out.println("-------------");
        IntStream.range(1,50).asDoubleStream().forEach(System.out::println);
    }
}
