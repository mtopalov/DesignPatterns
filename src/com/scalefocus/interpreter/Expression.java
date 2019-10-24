package com.scalefocus.interpreter;

/**
 * Defines the behaviour of {@link Expression}.
 *
 * @author Mariyan Topalov
 */
public interface Expression {

    /**
     * Interprets a context, given as a parameter.
     * Checks if {@link Expression} is present in the context.
     *
     * @param context {@link String} - context to be checked
     */
    boolean interpret(String context);
}
