package com.java8.streamApi.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsTerminalGroupingByEx2 {

    public static void main(String[] args) {
        threeLevelGrouping();
    }

    public static void threeLevelGrouping(){
        Map<Integer,Set<Student>> studentMapSet = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,HashMap::new,Collectors.toSet()));
        studentMapSet.forEach((s, students) -> {
            System.out.println(s);
            System.out.println(students);
        });
    }
}
