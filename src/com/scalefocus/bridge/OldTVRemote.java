package com.scalefocus.bridge;

/**
 * Inherits the behaviour of {@link RemoteControl}.
 *
 * @author Mariyan Topalov
 */
public class OldTVRemote extends RemoteControl {

    public OldTVRemote(Device device) {
        super(device);
    }

    /**
     * Calls the {@link Device#mute()} that turns the volume to 0.
     */
    @Override
    void centerButton() {
        device.mute();
    }
}
