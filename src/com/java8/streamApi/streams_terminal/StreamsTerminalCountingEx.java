package com.java8.streamApi.streams_terminal;

import com.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsTerminalCountingEx {

    public static void main(String[] args) {
        System.out.println(countingEx());
    }

    public static long countingEx(){
        return StudentDataBase.getAllStudents().stream().
                filter(student -> student.getGpa()>=3.9).
                collect(Collectors.counting());
    }
}
