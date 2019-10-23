package com.scalefocus.bridge;

/**
 * Inherits the functionality of {@link RemoteControl}.
 * Implements unimplemented methods.
 *
 * @author Mariyan Topalov
 */
public class OldTVRemote extends RemoteControl {

    public OldTVRemote(Device device) {
        super(device);
    }

    @Override
    void centerButton() {
        device.mute();
    }
}
