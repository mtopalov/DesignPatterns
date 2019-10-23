package com.scalefocus.decorator;

/**
 * Inherits the behaviour of {@link Mobile} and implements it's methods.
 *
 * @author Mariyan Topalov
 */
public class Sony implements Mobile {

    /**
     * {@inheritDoc}
     */
    @Override
    public void playMusic() {
        System.out.println("Listening Sony music.");
    }
}
