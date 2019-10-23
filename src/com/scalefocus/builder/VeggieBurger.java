package com.scalefocus.builder;

/**
 * Class that inherits the behaviour from {@link Item}.
 * Implements the unimplemented methods
 *
 * @author Mariyan Topalov
 */
public class VeggieBurger implements Item{

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public String name() {
        return "Veggie burger";
    }

    /**
     * {@inheritDoc}
     *
     * @return {@inheritDoc}
     */
    @Override
    public float price() {
        return 25.5f;
    }
}
