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

    private String position;

    private float salary;

    private List<Employee> subordinates;

    public Employee(String name, String position, float salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    /**
     * Adds an {@link Employee} to the subordinates {@link List}.
     *
     * @param employee - {@link Employee} to be added.
     */
    public void add(Employee employee) {
        subordinates.add(employee);
    }

    /**
     * Removes an {@link Employee} from the subordinates {@link List}.
     *
     * @param employee - {@link Employee} to be removed.
     */
    public void remove(Employee employee) {
        subordinates.remove(employee);
    }

    /**
     * Returns the subordinates {@link List}
     *
     * @return {@link List<Employee>} - Returns the subordinates {@link List}
     */
    public List<Employee> getSubordinates() {
        return subordinates;
    }

    /**
     * Formats the information for an {@link Employee} and returns it.
     *
     * @return {@link String} - information for the {@link Employee}, formatted to be easy for output.
     */
    @Override
    public String toString() {
        return "Name: " + name + "| Job: " + position + "| Salary: " + salary;
    }
}
