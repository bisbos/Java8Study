package com.java8.streamApi.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsTerminalMinByMaxByEx {

    public static void main(String[] args) {
        System.out.println(minByEx());
        System.out.println(maxByEx());
    }

    public static String minByEx(){
        Optional<Student> student = StudentDataBase.getAllStudents().stream().collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
        return student.get().getName();
    }

    public static String maxByEx(){
        Optional<Student> student = StudentDataBase.getAllStudents().stream().collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
        return student.get().getName();
    }
}
