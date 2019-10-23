package com.scalefocus.prototype;

/**
 * Class that inherits the {@link Shape} class.
 * Implements method draw.
 *
 * @author Mariyan Topalov
 */
public class Rectangle extends Shape implements Cloneable {

    public Rectangle(int id) {
        super(id);
        type = "Rectangle";
    }

    @Override
    protected Shape clone() {
        Shape shape = new Rectangle(this.getId());
        shape.setType(this.getType());

        return shape;
    }

    /**
     * Draws a {@link Rectangle}
     */
    @Override
    void draw() {
        System.out.println("Rectangle draw..");
    }


}
