package com.scalefocus.adapter;

/**
 * Class based on the Adapter design pattern.
 * It adapts Tesla so it can be used just like an ordinary Car, through Car interface.
 *
 * @author Mariyan Topalov
 */
public class TeslaAdapter implements Car {

    private final Tesla tesla;

    public TeslaAdapter() {
        tesla = new Tesla();
    }

    /**
     * Calls Tesla's start method, through the Car interface
     */
    @Override
    public void fireEngine() {
        tesla.start();
    }

    /**
     * Calls Tesla's recharge method, through the Car interface
     */
    @Override
    public void refuel() {
        tesla.recharge();
    }
}
