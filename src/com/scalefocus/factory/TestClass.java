package com.scalefocus.factory;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();

        try {
            Laptop unknown = factory.getLaptop("unknown");
            unknown.switchOn();
        } catch (NoSuchLaptopException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Laptop lenovo = factory.getLaptop("lenovo");
            lenovo.switchOn();
        } catch (NoSuchLaptopException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
