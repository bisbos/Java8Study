package com.java8.methodreferences.StaticMethodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class Numbers {

    public static boolean isMoreThanFifty(int n1,int n2){
        return (n1+n2)>50;
    }

    public static List<Integer> findNumbers(List<Integer> list, BiPredicate<Integer,Integer> predicate){
        List<Integer> newList = new ArrayList<>();
        for (Integer i:list){
            if (predicate.test(i,i+10)){
                newList.add(i);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,5,45,18,33,24,40);

     /*   List<Integer> resultList = Numbers.findNumbers(list, new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer integer, Integer integer2) {
                return Numbers.isMoreThanFifty(integer,integer2);
            }
        }); */

    // List<Integer> resultList = Numbers.findNumbers(list,(n1,n2) -> Numbers.isMoreThanFifty(n1,n2));

        List<Integer> resultList = Numbers.findNumbers(list, Numbers::isMoreThanFifty);
    }
}
