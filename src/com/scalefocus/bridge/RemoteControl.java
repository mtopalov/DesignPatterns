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

    public void rightButton(){
        device.volumeUp();
    }

    public void leftButton(){
        device.volumeDown();
    }

    public void upButton(){
        device.channelUp();
    }

    public void downButton(){
        device.channelDown();
    }

    public void showInfo(){
        device.deviceFeedback();
    }

    abstract void centerButton();
}
