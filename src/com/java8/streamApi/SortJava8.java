package com.java8.streamApi;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortJava8 {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Vijay");
        nameList.add("Sunil");
        nameList.add("Anil");
        nameList.add("Rohit");
        nameList.add("Bisin");

        List<String> sortedList = nameList.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("--------------------");

        List<String> sortedList1 = nameList.stream().sorted(String::compareTo).collect(Collectors.toList());
        sortedList1.forEach(System.out::println);

        System.out.println("--------------------");

        List<String> sortedList2 = nameList.stream().sorted(Comparator.comparing(String::toString)).collect(Collectors.toList());
        sortedList2.forEach(System.out::println);

        System.out.println("--------------------");
        List<Student> studentList = getSortedName();
        studentList.forEach(System.out::println);

        System.out.println("--------------------");
        List<String> reverseSortedList = nameList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        reverseSortedList.forEach(System.out::println);

        System.out.println("--------------------");
        List<String> reverseSortedList1 = nameList.stream().sorted(Comparator.comparing(String::toString).reversed()).collect(Collectors.toList());
        reverseSortedList1.forEach(System.out::println);

        System.out.println("--------------------");
        List<Student> reversedStudentList = getReversedName();
        reversedStudentList.forEach(System.out::println);

    }

    public static List<Student> getSortedName(){
        List<Student> sortedStudents = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        return sortedStudents;
    }

    public static List<Student> getReversedName(){
        List<Student> reversedStudentList = StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(Collectors.toList());
        return reversedStudentList;
    }
}
