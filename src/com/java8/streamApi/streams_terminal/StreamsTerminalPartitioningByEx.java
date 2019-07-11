package com.java8.streamApi.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsTerminalPartitioningByEx {

    public static void main(String[] args) {
        partitionByEx();
    }

    private static void partitionByEx(){
        Predicate<Student> studentPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean,List<Student>> partitionMap = StudentDataBase.getAllStudents().stream().collect(Collectors.partitioningBy(studentPredicate));
        System.out.println(partitionMap);
    }
}
