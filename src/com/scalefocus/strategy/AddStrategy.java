package com.scalefocus.strategy;

/**
 * Gets the behaviour of the {@link Strategy} interface.
 * This class implements the {@link Strategy#execute(int, int)} that returns the result of (int + int).
 *
 * @author Mariyan Topalov
 */
public class AddStrategy implements Strategy {

    /**
     * Returns the sum of two integers.
     *
     * @param num1 {@link int} - first integer.
     * @param num2 {@link int} - second integer.
     * @return {@link int} - the sum of two integers, given as parameters.
     */
    @Override
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}
