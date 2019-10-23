package com.scalefocus.facade;

/**
 * Class that implements the methods, defined in {@link Shape} interface.
 *
 * @author Mariyan Topalov
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
}
