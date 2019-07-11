package com.java8.streamApi.streams_numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingEx {

    public static void main(String[] args) {

        List<Integer> intList = boxing();
        System.out.println(intList);

        System.out.println(unbloxing(intList));

    }

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10). //int
                boxed(). //Integer
                collect(Collectors.toList());
    }

    public static int unbloxing(List<Integer> integerList){
        return integerList.stream().
                mapToInt(Integer::intValue)  //returns IntStream (int value of the wrapper class)
                .sum();
    }
}
