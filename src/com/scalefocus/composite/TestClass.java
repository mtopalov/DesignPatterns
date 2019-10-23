package com.scalefocus.composite;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {

        Employee CEO = new Employee("Gosho", "CEO", 10000);

        Employee headSales = new Employee("Pesho", "Head Sales", 5000);
        Employee headLogistics = new Employee("Mariya", "Head Logistics", 5000);

        Employee salesManager = new Employee("Ivana", "Sales Manager", 2500);
        Employee salesManager1 = new Employee("Ivancho", "Sales Manager", 2500);

        Employee logManager = new Employee("Joro", "Logistics Manager", 2600);
        Employee logManager1 = new Employee("Nikolai", "Logistics Manager", 2600);

        CEO.add(headLogistics);
        CEO.add(headSales);

        headSales.add(salesManager);
        headSales.add(salesManager1);

        headLogistics.add(logManager);
        headLogistics.add(logManager1);

        System.out.println(CEO);
        for (Employee headEmp : CEO.getSubordinates()) {
            System.out.println(headEmp);

            for (Employee employee : headEmp.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
