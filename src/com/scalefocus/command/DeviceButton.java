package com.scalefocus.command;

/**
 * The invoker class.
 * This class stores a {@link Command} in itself and later that {@link Command} can be executed.
 *
 * @author Mariyan Topalov
 */
public class DeviceButton {

    private final Command command;

    public DeviceButton(Command command) {
        this.command = command;
    }

    /**
     * Calls the {@link Command}'s execute method.
     */
    void press(){
        command.execute();
    }

    /**
     * Undoes the changes done by press method.
     */
    void pressUndo(){
        command.undo();
    }
}
