package com.scalefocus.command;

/**
 * Test class
 *
 * @author Mariyan Topalov
 */
public class TestClass {

    public static void main(String[] args) {
        ElectronicDevice device = new Television();

        Command turnOn = new TurnDeviceOn(device);
        Command turnOff = new TurnDeviceOff(device);

        DeviceButton onButton = new DeviceButton(turnOn);
        DeviceButton offButton = new DeviceButton(turnOff);

        onButton.press();
        offButton.press();
        offButton.pressUndo();

        device = new Radio();
        turnOn = new TurnDeviceOn(device);
        onButton = new DeviceButton(turnOn);

        onButton.press();
        onButton.pressUndo();
    }

}
