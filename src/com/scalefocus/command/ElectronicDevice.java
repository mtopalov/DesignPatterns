package com.scalefocus.command;

/**
 * Declares the behaviour that an {@link ElectronicDevice} have.
 *
 * @author Mariyan Topalov
 */
public interface ElectronicDevice {

    /**
     * Turns on the device.
     */
    void turnOn();

    /**
     * Turns off the device.
     */
    void turnOff();
}

