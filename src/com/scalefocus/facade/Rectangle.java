package com.scalefocus.facade;

/**
 * Inherits the behaviour of {@link Shape}.
 *
 * @author Mariyan Topalov
 */
public class Rectangle implements Shape {

    /**
     * Draws a {@link Rectangle}.
     */
    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
}
