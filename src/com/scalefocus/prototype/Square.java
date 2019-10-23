package com.scalefocus.prototype;

/**
 * Class that inherits the {@link Shape} class.
 * Implements method draw.
 *
 * @author Mariyan Topalov
 */
public class Square extends Shape implements Cloneable {

    public Square(int id) {
        super(id);
        type = "Square";
    }

    @Override
    protected Shape clone() {
        Shape shape = new Square(this.getId());
        shape.setType(this.getType());

        return shape;
    }

    /**
     * Draws a {@link Square}
     */
    @Override
    void draw() {
        System.out.println("Square draw..");
    }
}
