package com.scalefocus.builder;

/**
 * Class that inherits the behaviour from {@link Item}.
 * Implements the unimplemented methods
 *
 * @author Mariyan Topalov
 */
public class ChickenBurger implements Item {

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public String name() {
        return "Chicken burger";
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public float price() {
        return 50.5f;
    }
}
