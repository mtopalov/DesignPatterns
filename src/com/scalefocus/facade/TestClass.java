package com.scalefocus.facade;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        ShapeFacade maker = new ShapeFacade();

        maker.drawCircle();
        maker.drawRectangle();
        maker.drawSquare();
    }
}
