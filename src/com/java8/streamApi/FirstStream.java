package com.java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class FirstStream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bisin","Ajay","Vijay");
        names.stream();
        names.parallelStream();
    }
}
