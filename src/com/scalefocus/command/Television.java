package com.scalefocus.command;

/**
 * Implements the methods, declared in {@link ElectronicDevice} interface.
 *
 * @author Mariyan Topalov
 */
public class Television implements ElectronicDevice {

    /**
     * {@inheritDoc}
     * - {@link Television}
     */
    public void turnOn() {
        System.out.println("TV is ON");
    }

    /**
     * {@inheritDoc}
     * - {@link Television}
     */
    public void turnOff() {
        System.out.println("TV is OFF");
    }
}
