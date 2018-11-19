package com.java8.streamApi;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static void main(String[] args) {
        System.out.println(getActivities());
        System.out.println(getDistinctActivities());
        System.out.println(getCountActivities());
        System.out.println(getActivitiesSorted());
        System.out.println(getActivitiesReverseSorted());
    }

    public static List<String> getActivities(){
        List<String> activities = StudentDataBase.getAllStudents().stream().//Stream<Student>
                            //Student getActivities return List<String>
                             map(Student::getActivities).  //  Stream<List<String>>
                             flatMap(List::stream).collect(Collectors.toList());
        return activities;
    }

    public static List<String> getDistinctActivities(){
        List<String> activities = StudentDataBase.getAllStudents().stream().//Stream<Student>
                //Student getActivities return List<String>
                        map(Student::getActivities).  //  Stream<List<String>>
                         flatMap(List::stream).
                        distinct().
                        collect(Collectors.toList());
        return activities;
    }

    public static Long getCountActivities(){
        Long count = StudentDataBase.getAllStudents().stream().//Stream<Student>
                //Student getActivities return List<String>
                        map(Student::getActivities).  //  Stream<List<String>>
                flatMap(List::stream).
                distinct().
                count();
        return count;
    }

    public static List<String> getActivitiesSorted(){
        List<String> activities = StudentDataBase.getAllStudents().stream().//Stream<Student>
                //Student getActivities return List<String>
                        map(Student::getActivities).  //  Stream<List<String>>
                flatMap(List::stream).
                        distinct().sorted().
                        collect(Collectors.toList());
        return activities;
    }

    public static List<String> getActivitiesReverseSorted(){
        List<String> activities = StudentDataBase.getAllStudents().stream().//Stream<Student>
                //Student getActivities return List<String>
                        map(Student::getActivities).  //  Stream<List<String>>
                flatMap(List::stream).
                        distinct().sorted(Comparator.reverseOrder()).
                        collect(Collectors.toList());
        return activities;
    }
}
