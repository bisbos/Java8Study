package com.java8.functionalInterfaces;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<List<Student>> supplier = ()->StudentDataBase.getAllStudents();
        System.out.println(supplier.get());
    }
}
