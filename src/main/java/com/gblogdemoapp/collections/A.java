package com.gblogdemoapp.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    public static void main(String[] args) {
    List<Employee> details = Arrays.asList(
                new Employee(2,"mike", 10000),
                new Employee(1,"stallin",9500),
                new Employee(3,"thyson",11000)
        );
        List<Employee> collect = details.stream().filter(d -> d.getSalary() >= 10000)
                .collect(Collectors.toList());
        for(Employee emp : collect){
            System.out.println(emp.getId());
            System.out.println(emp.getName());
            System.out.println(emp.getSalary());
        }
    }
    }

