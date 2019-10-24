package com.scalefocus.command;

/**
 * Implements the behaviour defined in {@link ElectronicDevice} interface.
 *
 * @author Mariyan Topalov
 */
public class Radio implements ElectronicDevice {

    /**
     * {@inheritDoc}
     * - {@link Radio}
     */
    @Override
    public void turnOn() {
        System.out.println("Radio is ON");
    }

    /**
     * {@inheritDoc}
     * - {@link Radio}
     */
    @Override
    public void turnOff() {
        System.out.println("Radio is OFF");
    }
}
