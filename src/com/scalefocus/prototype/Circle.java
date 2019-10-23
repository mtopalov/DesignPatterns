package com.scalefocus.prototype;

/**
 * Class that inherits the {@link Shape} class.
 * Implements method draw.
 *
 * @author Mariyan Topalov
 */
public class Circle extends Shape implements Cloneable {

    public Circle(int id) {
        super(id);
        type = "Circle";
    }

    /**
     * Draws a {@link Circle}
     */
    @Override
    void draw() {
        System.out.println("Circle draw..");
    }

    @Override
    protected Shape clone() {
        Shape shape = new Circle(this.getId());
        shape.setType(this.getType());

        return shape;
    }
}
