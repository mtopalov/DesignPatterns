package com.scalefocus.bridge;

/**
 * Inherits the behaviour of {@link Device}.
 *
 * @author Mariyan Topalov
 */
public class TVDevice extends Device {

    public TVDevice() {
        super(100);
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
