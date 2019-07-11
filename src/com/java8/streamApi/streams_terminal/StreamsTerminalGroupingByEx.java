package com.java8.streamApi.streams_terminal;


import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTerminalGroupingByEx {

    public static void main(String[] args) {
        groupByGender();
        customizedGroupByGender();
    }

    //This method will group the students based on gender
    public static void groupByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGender));
        studentMap.forEach((s, students) -> {
            System.out.println(s);
            System.out.println(students);
        });
    }

    //Students greater than = 3.8 as Outstanding and less than 3.8 is average
    public static void customizedGroupByGender(){
        Map<String,List<Student>> gpaGroup = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSANDING":"AVERAGE"));
        gpaGroup.forEach((s, students) -> {
            System.out.println(s);
            System.out.println(students);
        });
    }
}
