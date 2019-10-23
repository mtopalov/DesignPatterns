package com.scalefocus.prototype;

/**
 * Test class.
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape(1);
        System.out.println("Shape: " + clonedShape.getType());
        clonedShape.draw();

        clonedShape = ShapeCache.getShape(2);
        System.out.println("Shape: " + clonedShape.getType());
        clonedShape.draw();

        clonedShape = ShapeCache.getShape(3);
        System.out.println("Shape: " + clonedShape.getType());
        clonedShape.draw();
    }
}
