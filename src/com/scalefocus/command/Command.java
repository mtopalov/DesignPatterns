package com.scalefocus.command;

/**
 * Interface that defines the behaviour that every {@link Command} must have.
 *
 * @author Mariyan Topalov
 */

public interface Command {

    /**
     * Executes the {@link Command}.
     */
    void execute();

    /**
     * Undoes the  {@link Command}.
     */
    void undo();
}