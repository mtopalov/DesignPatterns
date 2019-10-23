package com.scalefocus.builder;

/**
 * Class that inherits the behaviour from {@link Item}.
 *
 * @author Mariyan Topalov
 */
public class Cola implements Item {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public String name() {
        return "Cola";
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public float price() {
        return 13.6f;
    }
}
