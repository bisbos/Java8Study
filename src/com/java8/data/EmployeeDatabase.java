package com.java8.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDatabase {


    public static List<Employee> getEmployees(){

        Employee employee1 = new Employee("Alice","London",1000);
        Employee employee2 = new Employee("Bob","London",4000);
        Employee employee3 = new Employee("Charles","New York",2500);
        Employee employee4 = new Employee("Dorothy","Hong Kong",4900);
        Employee employee5 = new Employee("Tom","Hong Kong",2900);
        Employee employee6 = new Employee("Adam","London",2000);

        List<Employee> employeeList = Arrays.asList(employee1,employee2,employee3,employee4,employee5);
        return employeeList;


    }
}
