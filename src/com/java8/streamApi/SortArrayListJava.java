package com.java8.streamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayListJava {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Vijay");
        nameList.add("Sunil");
        nameList.add("Anil");
        nameList.add("Rohit");
        nameList.add("Bisin");

        Collections.sort(nameList);
        for (String name:nameList)
            System.out.println(name);

        System.out.println("--------------------");

        Collections.sort(nameList,Collections.reverseOrder());
        for (String name:nameList)
            System.out.println(name);

    }
}
