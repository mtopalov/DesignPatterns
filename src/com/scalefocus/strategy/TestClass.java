package com.scalefocus.strategy;

/**
 * Test class.
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        //strategies
        Strategy addition = new AddStrategy();
        Strategy subtraction = new SubtractStrategy();
        Strategy multiplication = new MultiplyStrategy();

        //context
        Context context = new Context();

        //here we can see how the context changes when it's strategy has changed
        context.setStrategy(addition);
        System.out.println("AddStrategy: " + context.executeStrategy(1, 2));

        context.setStrategy(subtraction);
        System.out.println("SubtractStrategy: " + context.executeStrategy(1, 2));

        context.setStrategy(multiplication);
        System.out.println("MultiplyStrategy: " + context.executeStrategy(1, 2));
    }

}
