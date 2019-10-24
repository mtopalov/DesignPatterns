package com.scalefocus.bridge;

/**
 * Inherits the behaviour of {@link RemoteControl}.
 *
 * @author Mariyan Topalov
 */
public class SmartTVRemote extends RemoteControl {

    public SmartTVRemote(Device device) {
        super(device);
    }

    /**
     * Pauses the {@link Device}.
     */
    @Override
    void centerButton() {
        System.out.println("Channel paused.");
    }
}
