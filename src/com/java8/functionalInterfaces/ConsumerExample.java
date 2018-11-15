package com.java8.functionalInterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        //Consumer has an accept method. It takes a parameter and does not return any value
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("bisin");

        printNameAndActivities();

    }

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        Consumer<Student> name = student -> System.out.print(student.getName() +"\t");
        Consumer<Student> activities = student -> System.out.println(student.getActivities());

        //Consumer Chaining
        studentList.forEach(name.andThen(activities));

    }
}
