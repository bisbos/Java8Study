package com.java8.streamApi.streams_terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsTerminalGroupingByEx1 {

    public static void main(String[] args) {
        twoLevelGrouping();
        sumOfNoteBooksinGrade4();
    }

    //Group the Stundents based on Grade and then group by Gpa
    public static void twoLevelGrouping(){
        Map<Integer,Map<String,List<Student>>> studentMap = StudentDataBase.getAllStudents().stream().collect(
                                                            Collectors.groupingBy(Student::getGradeLevel,
                                                            Collectors.groupingBy(student -> student.getGpa()>=3.8 ? "OUTSANDING":"AVERAGE")));
        studentMap.forEach((s, students) -> {
            System.out.println(s);
            System.out.println(students);
        });
    }

    //Find the number of notebooks for the students in Grade 4
    public static void sumOfNoteBooksinGrade4(){
        Map<Integer,Integer> sumNoteBooks = StudentDataBase.getAllStudents().stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.summingInt(Student::getNoteBooks)));
        System.out.println(sumNoteBooks);
    }
}
