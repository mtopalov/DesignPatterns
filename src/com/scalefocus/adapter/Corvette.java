package com.scalefocus.adapter;

/**
 * Implement's the logic, introduced in {@link Car}.
 *
 * @author Mariyan Topalov
 */
public class Corvette implements Car {

    /**
     * {@inheritDoc}
     */
    @Override
    public void fireEngine() {
        System.out.println("Engine started!");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refuel() {
        System.out.println("Your tank is refueled!");
    }
}
