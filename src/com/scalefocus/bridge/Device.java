package com.scalefocus.bridge;

/**
 * Introduces the functionality of a device.
 * Gives methods to manipulate the volume of the device.
 *
 * @author Mariyan Topalov
 */
public abstract class Device {

    protected int currentChannel;

    protected int maxChannel;

    private int volume;

    public Device(int maxChannel) {
        this.maxChannel = maxChannel;
    }

    /**
     * Changes the channel so it goes up by 1. Does nothing if the {@link Device#currentChannel} is equal to {@link Device#maxChannel}.
     */
    public abstract void channelUp();

    /**
     * Changes the channel so it goes down by 1. Does nothing if the {@link Device#currentChannel} is equal to 0.
     */
    public abstract void channelDown();

    public void volumeUp() {
        if (volume < 10) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

    public void mute() {
        volume = 0;
    }

    /**
     * Prints the current state of the {@link Device}.
     */
    public void deviceFeedback() {
        System.out.println("Device: " + this.getClass().getSimpleName() + "\nState: " + currentChannel + "\nVolume: " + volume);
    }
}
