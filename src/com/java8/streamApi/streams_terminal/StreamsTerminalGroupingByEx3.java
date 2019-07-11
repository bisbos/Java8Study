package com.java8.streamApi.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsTerminalGroupingByEx3 {

    public static void main(String[] args) {
        groupByMaxbyMinByEx();
    }

    //Calculate the top Gpa Student in each grade
    public static void groupByMaxbyMinByEx(){
        Map<Integer,Optional<Student>> studentMap = StudentDataBase.getAllStudents().stream().
                collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.maxBy(Comparator.comparing(Student::getGpa))));
        studentMap.forEach((s, students) -> {
            System.out.println(s);
            System.out.println(students);
        });

        System.out.println("----------");
        Map<Integer,Student> studentMap1 = StudentDataBase.getAllStudents().stream().
                collect(Collectors.groupingBy(Student::getGradeLevel,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));

        studentMap1.forEach((s, students) -> {
            System.out.println(s);
            System.out.println(students);
        });
    }
}
