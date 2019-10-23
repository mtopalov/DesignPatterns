package com.scalefocus.factory;

/**
 * Class that implements the functionality of Laptop interface.
 *
 * @author Mariyan Topalov
 */
class Razer implements Laptop {

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
