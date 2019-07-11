package com.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceMinMaxExample {

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(3,6,18,12,23,21,15);

        Optional<Integer> maxElement = numList.stream().max(Integer::compareTo);
        System.out.println(maxElement.get());

    }
}
