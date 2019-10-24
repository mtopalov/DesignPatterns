package com.scalefocus.facade;

/**
 * Inherits the behaviour of {@link Shape}.
 *
 * @author Mariyan Topalov
 */
public class Circle implements Shape {

    /**
     * Draws a {@link Circle}.
     */
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
}
