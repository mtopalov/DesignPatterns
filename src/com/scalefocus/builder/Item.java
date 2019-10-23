package com.scalefocus.builder;

/**
 * Defines methods that every item have.
 *
 * @author Mariyan Topalov
 */
public interface Item {

    /**
     * Getter for item's name.
     *
     * @return {@link String} - the name of the item.
     */
    String name();

    /**
     * Getter for item's price.
     *
     * @return {@link float} - the price of an item
     */
    float price();
}
