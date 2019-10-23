package com.scalefocus.bridge;

/**
 * Inherits the functionality of {@link RemoteControl}.
 * Implements unimplemented methods.
 *
 * @author Mariyan Topalov
 */
public class SmartTVRemote extends RemoteControl {

    public SmartTVRemote(Device device) {
        super(device);
    }

    @Override
    void centerButton() {
        System.out.println("Channel paused.");
    }
}
