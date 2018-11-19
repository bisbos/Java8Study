package com.java8.streamApi;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecondStream {

    public static void main(String[] args) {

        //List Student name and Activities
    /*    Map<String,List<String>> studentActivity = StudentDataBase.getAllStudents().stream().collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentActivity);

        //List Student name and Activities with Grade Level >=3
        Map<String,List<String>> studentActivity1 = StudentDataBase.getAllStudents().stream().
                                    filter(student -> student.getGradeLevel()>=3).
                                    collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentActivity1); */

        //List Student name and Activities with Grade Level >=3 and GPA >=3.9
        Map<String,List<String>> studentActivity2 = StudentDataBase.getAllStudents().stream().
                peek(student -> System.out.println("Before Filter --> "+student)).
                filter(student -> student.getGradeLevel()>=3).
                peek(student -> System.out.println("After Filter 1 --> "+student)).
                filter(student -> student.getGpa()>3.9).
                peek(student -> System.out.println("After Filter 2 --> "+student)).
                collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentActivity2);
    }
}
