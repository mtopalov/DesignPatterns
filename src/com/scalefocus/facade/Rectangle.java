package com.scalefocus.facade;

/**
 * Class that implements the methods, defined in {@link Shape} interface.
 *
 * @author Mariyan Topalov
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle.draw()");
    }
}
