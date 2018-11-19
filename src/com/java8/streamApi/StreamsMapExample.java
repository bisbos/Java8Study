package com.java8.streamApi;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void main(String[] args) {
        System.out.println(getNameList());
    }

    public static List<String> getNameList(){
        List<String> nameList = StudentDataBase.getAllStudents().stream(). //Stream<Student>
                // Map takes a Function as parameter. Function has Student as the input and String (name) as the output
                map(Student::getName). //Stream<String>
                collect(Collectors.toList());
        return nameList;
    }
}
