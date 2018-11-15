package com.java8.functionalInterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {


        BiConsumer<String,String> consumer = (a,b) -> {
            System.out.println(a);
            System.out.println(b);
        };
        consumer.accept("bisin","java");

        BiConsumer<Integer,Integer> multiply = (a,b) -> {
            System.out.println(a*b);
        };

        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println(a/b);
        };

        multiply.andThen(division).accept(10,5);


    //    multiply.accept(5,2);

        printNameAndActivities();
    }

    public static void printNameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        BiConsumer<String,List<String>> nameActivities = (name,activities) -> {
            System.out.print(name+"\t");
            System.out.println(activities);
        };

        studentList.forEach(student -> nameActivities.accept(student.getName(),student.getActivities()));

    }
}
