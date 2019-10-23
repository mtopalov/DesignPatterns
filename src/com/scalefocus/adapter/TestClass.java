package com.scalefocus.adapter;

/**
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        Corvette corvette = new Corvette();
        Tesla tesla = new Tesla();
        Car teslaAdapter = new TeslaAdapter();

        corvette.fireEngine();
        corvette.refuel();

        tesla.start();
        tesla.recharge();

        teslaAdapter.fireEngine();
        teslaAdapter.refuel();
    }
}
