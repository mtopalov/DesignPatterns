package com.scalefocus.builder;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        LunchBuilder lunchBuilder = new LunchBuilder();

        Lunch lunch = lunchBuilder.prepareBrutalLunch();
        lunch.showItems();
        System.out.println("Total cost: " + lunch.getCost());

        lunch = lunchBuilder.prepareVeggieLunch();
        lunch.showItems();
        System.out.println("Total cost: " + lunch.getCost());
    }
}
