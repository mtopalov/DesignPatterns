package com.scalefocus.proxy;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        Employee developer = new Employee("John", null);

        Employee engineer = new Employee("Daniel", "engineer");

        Server server = new ServerProxy(new DatabaseServer());

        server.checkServerAccess(developer);
        server.checkServerAccess(engineer);
    }
}
