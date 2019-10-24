package com.scalefocus.template;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        Game football = new Football();
        Game volleyball = new Volleyball();

        football.play();
        volleyball.play();
    }
}
