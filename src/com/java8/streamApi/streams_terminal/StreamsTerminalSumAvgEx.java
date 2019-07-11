package com.java8.streamApi.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsTerminalSumAvgEx {

    public static void main(String[] args) {
        System.out.println(getSum());
        System.out.println(getAverage());
    }

    public static int getSum(){
        int sum = StudentDataBase.getAllStudents().stream().collect(Collectors.summingInt(Student::getNoteBooks));
        return sum;
    }

    public static double getAverage(){
        double average = StudentDataBase.getAllStudents().stream().collect(Collectors.averagingDouble(Student::getGpa));
        return average;
    }
}
