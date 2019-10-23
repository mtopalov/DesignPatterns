package com.scalefocus.factory;

/**
 * Class that implements the functionality of Laptop interface
 *
 * @author Mariyan Topalov
 */
class Dell implements Laptop {

    /**
     * {@inheritDoc}
     */
    @Override
    public void switchOn() {
        System.out.println("Dell laptop switchOn()");
    }
}
