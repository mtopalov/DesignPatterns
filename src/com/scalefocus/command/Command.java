package com.scalefocus.command;

/**
 * Interface that declares the "do" and "undo" operations that every {@link Command} must have.
 *
 * @author Mariyan Topalov
 */

public interface Command {

    /**
     * Executes the current {@link Command}.
     */
    void execute();

    /**
     * Undoes the current {@link Command}.
     */
    void undo();
}