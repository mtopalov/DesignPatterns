package com.scalefocus.template;

/**
 * Gets the behaviour of {@link Game} and also the way the programme will be executed.
 * Only gives implementation to the steps of the execution.
 *
 * @author Mariyan Topalov
 */
public class Football extends Game {

    /**
     * {@inheritDoc}
     */
    @Override
    void initialize() {
        System.out.println("Football.initialize(): players enter the stadium.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    void start() {
        System.out.println("Football.start(): players start to play.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    void end() {
        System.out.println("Football.end(): the game ends.");
    }
}
