package com.scalefocus.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that saves objects of type {@link Item} in an {@link ArrayList}.
 *
 * @author Mariyan Topalov
 */
public class Lunch {

    private final List<Item> items;

    public Lunch() {
        items = new ArrayList<>();
    }

    /**
     * Adds an {@link Item} to the items {@link List}.
     * @param item - item to be added.
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Method that calculates the cost of all {@link Item}s stored in items {@link List}.
     *
     * @return {@link float} - the cost of all items.
     */
    public float getCost() {
        float cost = 0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * Prints the information of all items, stored in the lunch's {@link Item}s - {@link List}.
     */
    public void showItems() {
        for (Item item : items) {
            System.out.println("Item name - " + item.name() + ", Price - " + item.price());
        }
    }
}
