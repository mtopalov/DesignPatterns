package com.scalefocus.template;

/**
 * Class that has a "Template method". This method defines the way that the children of this class will behave.
 * Children of this class will be able to change the steps,
 * but won't be able to change the way these steps are executed.
 *
 * @author Mariyan Topalov
 */
public abstract class Game {

    /**
     * Initializes the game.
     */
    abstract void initialize();

    /**
     * Starts the game.
     */
    abstract void start();

    /**
     * Ends the game.
     */
    abstract void end();


    /**
     * Template method. This method defines the way that every child will behave.
     * Children of this class will be able to change the steps,
     * but won't be able to change the way these steps are executed.
     */
    public final void play() {
        initialize();

        start();

        end();
    }
}
