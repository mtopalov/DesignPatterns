package com.scalefocus.bridge;

/**
 * Inherits the functionality of {@link Device}. Implements unimplemented methods.
 *
 * @author Mariyan Topalov
 */
public class TVDevice extends Device {

    public TVDevice() {
        super(100);
    }

    @Override
    public void channelUp() {
        if (currentChannel < maxChannel) {
            currentChannel++;
        }
    }

    @Override
    public void channelDown() {
        if (currentChannel > 0) {
            currentChannel--;
        }
    }

}
