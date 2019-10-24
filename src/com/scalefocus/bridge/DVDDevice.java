package com.scalefocus.bridge;

/**
 * Inherits the behaviour of {@link Device}. Implements unimplemented methods.
 *
 * @author Mariyan Topalov
 */
public class DVDDevice extends Device {

    public DVDDevice() {
        super(20);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void channelUp() {
        if (currentChannel < maxChannel) {
            currentChannel++;
        }
    }
    /**
     * {@inheritDoc}
     */
    @Override
    public void channelDown() {
        if (currentChannel > 0) {
            currentChannel--;
        }
    }
}
