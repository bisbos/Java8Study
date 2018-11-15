package com.java8.functionalInterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> p1 = (a) -> {return a%2==0;};
        System.out.println(p1.test(10));
        Predicate<Integer> p2 = (a) -> {return a%5==0;};
        System.out.println(p2.test(10));

        System.out.println(p1.and(p2).test(10));
        System.out.println(p1.and(p2).test(15));

        System.out.println(p1.or(p2).test(10));
        System.out.println(p1.or(p2).test(15));

        System.out.println(p1.or(p2).negate().test(15));

        printNameAndActivitiesGrade3GPA4();
    }

    public static void printNameAndActivitiesGrade3GPA4(){
        List<Student> studentList = StudentDataBase.getAllStudents();

        Predicate<Student> studentPredicateGpa = (student) -> {return student.getGpa()>3.8;};

        //Consumer Chaining
        studentList.forEach(student -> {
            if(studentPredicateGpa.test(student)){
                System.out.println(student.getName());
            }
        });

        Predicate<Student> studentPredicateGrade = (student) -> {return student.getGradeLevel()>3;};
        studentList.forEach(student -> {
            if(studentPredicateGrade.and(studentPredicateGpa).test(student)){
                System.out.println(student.getName());
            }
        });

        BiPredicate<Integer,Double> biPredicate = (grade,gpa) -> grade>3 && gpa>3.8;
        studentList.forEach(student -> {
            if (biPredicate.test(student.getGradeLevel(),student.getGpa())){
                System.out.println(student.getName());
            }
        });

    }
}
