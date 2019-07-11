package com.java8.streamApi.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsTerminalMappingEx {

    public static void main(String[] args) {
        System.out.println(collectorMappingEx());
    }

    public static List<String> collectorMappingEx(){
        List<String> studentNames = StudentDataBase.getAllStudents().stream().collect(Collectors.mapping(Student::getName,Collectors.toList()));
        return studentNames;
    }
}
