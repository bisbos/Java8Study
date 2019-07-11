package com.java8.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,3,4);
        System.out.println(performMultiplication(numList));

        Optional<Integer> result = performMultiplicationWithoutIdentity(numList);
        if (result.isPresent()){
            System.out.println(result.get());
        }

    }

    public static int performMultiplication(List<Integer> numList){
        return numList.stream().
                //Value from the stream will be assigned to b (second parameter) and the result will be assigned to a (first parameter)
                //a=1 (identity value),b=1 ==> result =1
                //a=1 (result),b=2 ==> result =2
                //a=2, b=3 ==> result=6
                //a=6,b=4 ==> result =24
                reduce(1,(a,b)-> a*b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> numList){
        return numList.stream().
                //a=1 (identity value),b=1 ==> result =1
                //a=1 (result),b=2 ==> result =2
                //a=2, b=3 ==> result=6
                //a=6,b=4 ==> result =24
                        reduce((a,b)-> a*b);
    }
}
