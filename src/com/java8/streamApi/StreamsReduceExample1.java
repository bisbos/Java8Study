package com.java8.streamApi;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample1 {

    public static void main(String[] args) {
       Optional<Student> student = getStudentWithHighestGpa();
       if (student.isPresent()){
           System.out.println(student.get().getName());
       }

        Optional<Student> student1 = getStudentWithHighestGpaUsingMax();
        if (student1.isPresent()){
            System.out.println(student1.get().getName());
        }
    }

    public static Optional<Student> getStudentWithHighestGpa(){
    /*    Optional<Student> student = StudentDataBase.getAllStudents().stream().max(Comparator.comparing(Student::getGpa));
        return student; */

        Optional<Student> student = StudentDataBase.getAllStudents().stream().reduce(((student1, student2) -> {
            if (student1.getGpa()>student2.getGpa()){
                return student1;
            }else {
                return student2;
            }
        }));
        return student;
    }

    public static Optional<Student> getStudentWithHighestGpaUsingMax() {
        Optional<Student> student = StudentDataBase.getAllStudents().stream().max(Comparator.comparing(Student::getGpa));
        return student;
    }
}
