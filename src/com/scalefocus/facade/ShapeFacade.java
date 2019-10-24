package com.scalefocus.facade;

/**
 * Class that introduces the Facade design pattern.
 * That way we hide the complexity of the system
 * and provide the user only with simple methods
 * that lead to the actual {@link Shape}'s method calls.
 *
 * @author Mariyan Topalov
 */
public class ShapeFacade {

    private Shape circle;

    private Shape square;

    private Shape rectangle;

    public ShapeFacade() {
        this.circle = new Circle();
        this.square = new Square();
        this.rectangle = new Rectangle();
    }

    /**
     * Invokes {@link Circle}'s draw method.
     */
    public void drawCircle() {
        circle.draw();
    }

    /**
     * Invokes {@link Square}'s draw method.
     */
    public void drawSquare() {
        square.draw();
    }

    /**
     * Invokes {@link Rectangle}'s draw method.
     */
    public void drawRectangle() {
        rectangle.draw();
    }
}
