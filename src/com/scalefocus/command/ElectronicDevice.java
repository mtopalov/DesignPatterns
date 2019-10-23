package com.scalefocus.command;

/**
 * Declares the functionality that an {@link ElectronicDevice} have.
 *
 * @author Mariyan Topalov
 */
public interface ElectronicDevice {

    /**
     * Turns on the current device.
     */
    void turnOn();

    /**
     * Turns off the current device.
     */
    void turnOff();
}

