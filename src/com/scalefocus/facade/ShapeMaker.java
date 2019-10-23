package com.scalefocus.facade;

/**
 * Class that introduces the Facade design pattern.
 * It hides the implementation and provides the user only with simple methods that lead to the actual object method's calls.
 *
 * @author Mariyan Topalov
 */
public class ShapeMaker {

    private Shape circle;

    private Shape square;

    private Shape rectangle;

    public ShapeMaker() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
