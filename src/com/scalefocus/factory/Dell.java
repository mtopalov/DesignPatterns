package com.scalefocus.factory;

/**
 * Inherits the behaviour of {@link Laptop}.
 *
 * @author Mariyan Topalov
 */
class Dell implements Laptop {

    /**
     * The constructor is package-private so the client won't be able
     * to create instances of {@link Dell} without the {@link LaptopFactory}.
     */
    Dell() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn() {
        System.out.println("Dell laptop switchOn()");
    }
}
