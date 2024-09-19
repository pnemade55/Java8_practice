package com.practice.stream.problems;

import com.practice.stream.Employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeProblems {
    public static void main(String[] args) {

        List<Employee> emps=
                Arrays.asList(new Employee("Alice",28,60000,"HR"),
                        new Employee("Bob",35,75000,"Engineering"),
                        new Employee("Charlie",32,90000,"Engineering"),
                        new Employee("David",40,80000,"HR"),
                        new Employee("Eva",28,70000,"Finance"),
                        new Employee("Frank",45,95000,"Finance")
                        );


        // Q0. write function that takes list of employees and returns employee list for each department

        emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toList()))
                .entrySet().stream()
                        .forEach(e-> System.out.println(e.getKey() +" : "+ e.getValue()));

        System.out.println("Q1-------------------------------------------------");

        // Q1. write function that takes list of employees and returns the average salary of employee in each department
            emps.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)))
                    .entrySet()
                    .stream()
                    .forEach(e-> System.out.println(e.getKey() +" : "+ e.getValue()));


            System.out.println("Q2-------------------------------------------------");
        // Q2. write a function that takes list of employees and returns the employee with highest salary in each department

            emps.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))))
                    .entrySet()
                    .stream()
                    .forEach(e-> System.out.println(e.getKey() +" : "+ e.getValue().get()));

        System.out.println("Q3-------------------------------------------------");
        // Q3. write a function that takes list of employees and
        // returns a map where the keys are department and
        // values are list of employees sorted by their age in Desc order

        emps.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(
                                        Collectors.toList(),
                                list -> { list.sort(Comparator.comparingInt(Employee::getAge).reversed()); return list; }
                        )))
                        .entrySet()
                            .stream()
                .forEach(r -> System.out.println(r.getKey() +": "+ r.getValue()));
    }
}
