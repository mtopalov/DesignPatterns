package com.scalefocus.command;

/**
 * Class that implements the {@link Command} interface.
 * This class serves as wrapper of the {@link ElectronicDevice}.
 * It stores a request to the {@link ElectronicDevice} as a Command.
 * This command is later passed to an "Invoker" class that will
 * execute the command based on the type of the command.
 *
 * @author Mariyan Topalov
 */
public class TurnDeviceOn implements Command {

    private final ElectronicDevice device;

    public TurnDeviceOn(ElectronicDevice device) {
        this.device = device;
    }

    /**
     * Calls {@link ElectronicDevice}'s turn on method.
     */
    @Override
    public void execute() {
        device.turnOn();
    }

    /**
     * Undoes the change made by execute method.
     */
    @Override
    public void undo() {
        device.turnOff();
    }
}
