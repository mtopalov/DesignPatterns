package com.scalefocus.builder;

/**
 * Class that serves as a builder for {@link Lunch}.
 *
 * @author Mariyan Topalov
 */
public class LunchBuilder {

    /**
     * Creates a {@link Lunch} object, then stores some {@link Item}s in lunch's list.
     * At the end, returns the Lunch object.
     *
     * @return {@link Lunch} - prepared Lunch
     */
    public Lunch prepareVeggieLunch() {
        Lunch lunch = new Lunch();

        lunch.addItem(new VeggieBurger());
        lunch.addItem(new Cola());

        return lunch;
    }

    /**
     * Creates a {@link Lunch} object, then stores some {@link Item}s in lunch's list.
     * At the end, returns the Lunch object.
     *
     * @return {@link Lunch} - prepared Lunch
     */
    public Lunch prepareBrutalLunch() {
        Lunch lunch = new Lunch();

        lunch.addItem(new ChickenBurger());
        lunch.addItem(new ChickenBurger());
        lunch.addItem(new Fanta());

        return lunch;
    }
}
