package com.scalefocus.bridge;

/**
 * Serves as a bridge between the {@link Device} and the client.
 *
 * @author Mariyan Topalov
 */
public abstract class RemoteControl {

    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    /**
     * Increases {@link Device}'s volume, by invoking it's volumeUp method..
     */
    public void rightButton() {
        device.volumeUp();
    }

    /**
     * Decreases {@link Device}'s volume, by invoking it's volumeUp method..
     */
    public void leftButton() {
        device.volumeDown();
    }

    /**
     * Increases the {@link Device}'s channel, by invoking it's channelUp method..
     */
    public void upButton() {
        device.channelUp();
    }

    /**
     * Decreases the {@link Device}'s channel, by invoking it's channelUp method..
     */
    public void downButton() {
        device.channelDown();
    }

    /**
     * Prints information about the current state of the {@link Device}.
     */
    public void showInfo() {
        device.deviceFeedback();
    }

    abstract void centerButton();
}
