package com.scalefocus.factory;

/**
 * Class that implements the functionality of Laptop interface
 *
 * @author Mariyan Topalov
 */
class Lenovo implements Laptop {

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn() {
        System.out.println("Lenovo laptop switchOn()");
    }
}
