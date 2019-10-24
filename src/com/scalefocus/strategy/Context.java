package com.scalefocus.strategy;

/**
 * Class that holds a reference to a {@link Strategy}.
 * The class does not know the type of the concrete strategy.
 * Holds a method that executes the Strategy and does operation,
 * which requires two integers, based on the Strategy that's being set.
 *
 * @author Mariyan Topalov
 */
public class Context {

    private Strategy strategy;

    public Context() {
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }


    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Calls {@link Strategy#execute(int, int)} to do an operation, that requires two integers.
     * The result of the operation is based on the {@link Strategy} of the context.
     *
     * @param num1 {@link int} - first integer.
     * @param num2 {@link int} - second integer
     * @return {@link int} - result of the operation, based on the {@link Strategy} of the context.
     */
    public int executeStrategy(int num1, int num2) {
        return this.strategy.execute(num1, num2);
    }
}
