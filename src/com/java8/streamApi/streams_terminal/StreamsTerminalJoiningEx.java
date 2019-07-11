package com.java8.streamApi.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsTerminalJoiningEx {

    public static void main(String[] args) {
        joining_1();
        joining_2();
    }

    public static void joining_1(){
        String joinedName = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining());
        System.out.println(joinedName);
    }

    public static void joining_2(){
        String joinedName = StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining(" - "));
        System.out.println(joinedName);
    }
}
