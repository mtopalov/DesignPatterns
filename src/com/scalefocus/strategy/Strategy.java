package com.scalefocus.strategy;

/**
 * Defines the behaviour of a <i>{@link Strategy}</i>.
 * All classes that inherits this interface <u>must</u> behave exactly the same.
 *
 * @author Mariyan Topalov
 */
public interface Strategy {

    /**
     * Execute the {@link Strategy}.
     */
    int execute(int num1, int num2);
}
