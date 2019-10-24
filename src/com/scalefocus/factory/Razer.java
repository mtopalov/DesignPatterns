package com.scalefocus.factory;

/**
 * Inherits the behaviour of {@link Laptop}.
 *
 * @author Mariyan Topalov
 */
class Razer implements Laptop {

    /**
     * The constructor is package-private so the client won't be able
     * to create instances of {@link Dell} without the {@link LaptopFactory}.
     */
    Razer() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn() {
        System.out.println("Razer laptop switchOn()");
    }
}
