package com.scalefocus.factory;

/**
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();

        try {
            Laptop lenovo = factory.getLaptop("Lenovo");
            lenovo.switchOn();
        } catch (NoSuchLaptopException ex) {
            System.out.println(ex.toString());
        }
        try {
            Laptop dell = factory.getLaptop("Dell");
            dell.switchOn();
        } catch (NoSuchLaptopException ex) {
            System.out.println(ex.toString());
        }
        try {
            Laptop razer = factory.getLaptop("Razer");
            razer.switchOn();
        } catch (NoSuchLaptopException ex) {
            System.out.println(ex.toString());
        }
        try {
            Laptop unknown = factory.getLaptop("Unknown");
            unknown.switchOn();
        } catch (NoSuchLaptopException ex) {
            System.out.println(ex.toString());
        }


    }

}
