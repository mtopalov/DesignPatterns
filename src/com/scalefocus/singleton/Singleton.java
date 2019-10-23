package com.scalefocus.singleton;

/**
 * Class based on the Singleton design pattern.
 * This class can only have 1 instance.
 *
 * @author Mariyan Topalov
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    // private constructor to prevent creating object through "new" keyword
    private Singleton() {
    }

    /**
     * Returns the only instance of the class.
     * If the instance is not created, creates it and then returns it.
     *
     * @return {@link Singleton} - the only instance
     */
    public synchronized static Singleton getInstance() {
        return instance;
    }

}
