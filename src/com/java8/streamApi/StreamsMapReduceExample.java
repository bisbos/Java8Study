package com.java8.streamApi;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamsMapReduceExample {

    public static void main(String[] args) {

        Optional<Integer> totalNoteBooks = StudentDataBase.getAllStudents().stream().map(Student::getNoteBooks).
                //reduce((s1, s2) -> s1+s2 );
                        reduce(Integer::sum);
        System.out.println(totalNoteBooks.get());

    }
}
