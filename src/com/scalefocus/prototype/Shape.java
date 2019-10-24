package com.scalefocus.prototype;

/**
 * Abstract class that's used to draw shapes. Implements Cloneable interface.
 * Defines fields for the shapes, such as id and type.
 * Declares draw method, to be implemented by subclasses.
 *
 * @author Mariyan Topalov
 */
public abstract class Shape {

    private int id;

    protected String type;

    public Shape(int id) {
        this.id = id;
    }

    //getters and setters
    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }


    //abstract methods

    /**
     * Creates and returns deep copy of the {@link Shape}.
     *
     * @return {@link Shape} - deep copy on the {@link Shape}.
     */
    protected abstract Shape clone();

    /**
     * Method to draw a {@link Shape}.
     */
    abstract void draw();
}
