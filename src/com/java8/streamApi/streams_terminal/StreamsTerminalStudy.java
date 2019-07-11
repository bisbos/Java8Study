package com.java8.streamApi.streams_terminal;

import com.java8.data.Employee;
import com.java8.data.EmployeeDatabase;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsTerminalStudy {

    public static void main(String[] args) {
        System.out.println(groupEmployeeByCity());
        System.out.println("-----------");
        System.out.println(groupEmployeeByCityJava8());
        System.out.println("-----------");
        System.out.println(countEmployees());
        System.out.println("-----------");
        System.out.println(getAvgSalary());
        System.out.println("-----------");
        getEmployeesSalaryhavingCondition();
        System.out.println("-----------");
        groupByCityAndSort();

    }

    //Group Employees by City
    public static Map<String,List<String>> groupEmployeeByCity(){
        List<Employee> employeeList = EmployeeDatabase.getEmployees();
        Map<String,List<String>> employeeMap = new HashMap<>();
        for (Employee employee:employeeList){
            if (employeeMap.get(employee.getCity())!=null){
                employeeMap.get(employee.getCity()).add(employee.getName());
            }else{
                List<String> employees = new ArrayList<>();
                employees.add(employee.getName());
                employeeMap.put(employee.getCity(),employees);
            }
        }
        return employeeMap;
    }

    //Group Employees by City Using Java 8
    public static Map<String,List<String>> groupEmployeeByCityJava8(){
        Map<String,List<String>> employeeMap = EmployeeDatabase.getEmployees().stream().
                collect(Collectors.groupingBy(Employee::getCity,Collectors.mapping(Employee::getName,Collectors.toList())));
        return employeeMap;
    }

    //Calculate Number of Employees in each city
    public static Map<String,Long> countEmployees(){
        Map<String,Long> totalEmployees =  EmployeeDatabase.getEmployees().stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.counting()));
        return totalEmployees;
    }

    //Calculate Average Salary in each city
    public static Map<String,Double> getAvgSalary(){
        Map<String,Double> avgSalsary = EmployeeDatabase.getEmployees().stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.averagingInt(Employee::getSalary)));
        return avgSalsary;
    }

    //Find the no.of employees in each city having salary > 3000
    public static void getEmployeesSalaryhavingCondition(){
        Predicate<Employee> employeePredicate = employee -> employee.getSalary()>3000;
        Map<Boolean,Map<String,Long>> employeesinCity = EmployeeDatabase.getEmployees().stream().collect(Collectors.partitioningBy(employeePredicate,Collectors.groupingBy(Employee::getCity,Collectors.counting())));
        System.out.println(employeesinCity);
    }

    //Group By Salary >3000 and then group By City and then Sort by name and salary
    // Ans - Stream needs to be Sorted first. Then apply condition using partition and then group by city
    public static void groupByCityAndSort(){
        Predicate<Employee> employeePredicate = employee -> employee.getSalary()>3000;
        Map<Boolean,Map<String,List<Employee>>> employeeList = EmployeeDatabase.getEmployees().stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).
                collect(Collectors.partitioningBy(employeePredicate,Collectors.groupingBy(Employee::getCity)));

        System.out.println(employeeList);
    }

}
