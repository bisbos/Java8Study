package com.java8.functionalInterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static void main(String[] args) {

        List<Student> studentList = StudentDataBase.getAllStudents();
        Predicate<Student> studentPredicateGrade = (student) -> {return student.getGradeLevel()>3;};
        Map<String,Double> studentMap = new HashMap<>();

        BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> biFunctionEx = (students,predicateFunction)->{
            students.forEach(student -> {
                if (predicateFunction.test(student)){
                    studentMap.put(student.getName(),student.getGpa());
                }
            });
            return studentMap;
        };

        System.out.println(biFunctionEx.apply(studentList,studentPredicateGrade));
    }
}
