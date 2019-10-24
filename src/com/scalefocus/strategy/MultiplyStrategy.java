package com.scalefocus.strategy;

/**
 * Gets the behaviour of the {@link Strategy} interface.
 * This class implements the {@link Strategy#execute(int, int)} and returns the result of (int * int).
 *
 * @author Mariyan Topalov
 */
public class MultiplyStrategy implements Strategy {

    /**
     * Returns the multiplication of two integers.
     *
     * @param num1 {@link int} - first integer.
     * @param num2 {@link int} - second integer.
     * @return {@link int} - returns the multiplication of first and second integers.
     */
    @Override
    public int execute(int num1, int num2) {
        return num1 * num2;
    }
}
