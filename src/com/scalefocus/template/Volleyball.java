package com.scalefocus.template;

/**
 * Gets the behaviour of {@link Game} and also the way the programme will be executed.
 * Only gives implementation to the steps of the execution.
 *
 * @author Mariyan Topalov
 */
public class Volleyball extends Game {

    /**
     * {@inheritDoc}
     */
    @Override
    void initialize() {
        System.out.println("Volleyball.initialize(): players enter the field.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    void start() {
        System.out.println("Volleyball.start(): players start to play.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    void end() {
        System.out.println("Volleyball.end(): the game ends.");
    }
}
