package com.scalefocus.facade;

/**
 * Inherits the behaviour of {@link Shape}.
 *
 * @author Mariyan Topalov
 */
public class Square implements Shape {

    /**
     * Draws a {@link Square}.
     */
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
}
