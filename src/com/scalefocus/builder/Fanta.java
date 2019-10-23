package com.scalefocus.builder;

/**
 * Class that inherits the behaviour from {@link Item}.
 * Implements the unimplemented methods
 *
 * @author Mariyan Topalov
 */
public class Fanta implements Item {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public String name() {
        return "Fanta";
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public float price() {
        return 12.3f;
    }
}
