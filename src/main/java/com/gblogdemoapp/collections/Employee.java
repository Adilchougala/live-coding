package com.gblogdemoapp.collections;

public class Employee {
    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    private String name;
    private int salary;

    public Employee(int id,String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

}
