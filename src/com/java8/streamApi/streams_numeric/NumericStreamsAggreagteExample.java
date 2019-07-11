package com.java8.streamApi.streams_numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsAggreagteExample {

    public static void main(String[] args) {

        int total = IntStream.range(1,50).sum();
        System.out.println(total);

        OptionalInt optionalInt = IntStream.range(1,50).max();
        System.out.println(optionalInt.getAsInt());

        OptionalDouble optionalDouble = IntStream.range(1,50).average();
        System.out.println(optionalDouble.getAsDouble());
    }
}
