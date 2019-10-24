package com.scalefocus.observer;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        Stream stream = new Stream();

        //creates some subscribers and attaches them to the stream.
        new PremiumSubscriber(stream);
        new NormalSubscriber(stream);
        new PremiumSubscriber(stream);
        new PremiumSubscriber(stream);

        stream.setState("Giveaway soon!");
    }
}
