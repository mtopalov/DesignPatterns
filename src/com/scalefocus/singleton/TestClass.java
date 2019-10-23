package com.scalefocus.singleton;

/**
 * Class to test Singleton
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }
}
