package com.java8.functionalInterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String,String> functionEx = (name) -> name.toUpperCase();
        System.out.println(functionEx.apply("Bisin"));

        Function<String,String> concatFunc = (name) -> name.concat("bose");

        // OuterFunction will execute first and the result will be passed to the function specified in the parameter and execute it
        System.out.println(functionEx.andThen(concatFunc).apply("bisin"));

        // the function specified in the parameter will execute first and the result will be passed to OuterFunction and execute it
        System.out.println(functionEx.compose(concatFunc).apply("bisin"));

        printStudentNameGPA();



    }


    // Function will take an input parameter of Type T and  return output of Type R
    public static void printStudentNameGPA(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        Map<String,Double> studentMap = new HashMap<>();
        Function<List<Student>,Map<String,Double>> studentFunction = (students -> {
            studentList.forEach(student -> {
                studentMap.put(student.getName(),student.getGpa());
            });
            return studentMap;
        });
        System.out.println(studentFunction.apply(studentList));
    }



}
