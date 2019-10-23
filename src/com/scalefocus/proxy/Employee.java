package com.scalefocus.proxy;

/**
 * Basic class used to create employees.
 * Later they are being checked if the can access {@link Server}.
 *
 * @author Mariyan Topalov
 */
public class Employee {

    private String name;

    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}
