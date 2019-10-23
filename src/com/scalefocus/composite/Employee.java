package com.scalefocus.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that implements the Composition design pattern.
 * An employee can store another employees in it's list of subordinates.
 * This helps us build a hierarchy.
 *
 * @author Mariyan Topalov
 */
public class Employee {

    private String name;
    private String job;
    private float salary;

    private List<Employee> subordinates;

    public Employee(String name, String job, float salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    public void add(Employee employee){
        subordinates.add(employee);
    }
    public void remove(Employee employee){
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Name: " + name +"| Job: " + job + "| Salary: " + salary;
    }
}
